package DataStructure;

import java.util.NoSuchElementException;
import java.util.Random;

/**
 * 배열을 이용한 최소힙(Heap) 구현
 * - 배열로 구현하기 위해 제네릭 사용하지 않음
 *
 * 주요 기능
 * add 노드 추가
 * delete 루트 노드 삭제
 * peak 루트 노드 조회
 * compareTo 노드간의 값 비교
 * swap 노드 위치 교환
 */
public class HeapExample1 {

    public static void main(String[] args) {
        Random random = new Random();
        Heap h = new Heap(10);

        for (int i = 0; i < 10; i++) {
            int n = random.nextInt(19) + 1; // 1 ~ 20
            h.add(n);
        }

        System.out.println("최초 heap: " + h.toString());
        System.out.println("peek: " + h.peek());

        h.add(12);
        System.out.println("12 삽입 후 heap: " + h.toString());
        h.add(5);
        System.out.println("5 삽입 후 heap: " + h.toString());


    }

    protected static class Heap {
        int capacity = 0;
        int size = 0;
        int[] heap = null;

        public Heap(int capacity) {
            this.capacity = capacity;
            this.heap = new int[capacity + 1];
        }

        public void resize(int capacity) {
            if (this.size > capacity) {
                throw new IllegalArgumentException("힙의 크기보다 작아질 수는 없습니다.");
            }
            int[] newHeap = new int[capacity];
            for (int i = 1; i <= this.size; i++) {
                newHeap[i] = this.heap[i];
            }

            this.heap = newHeap;
        }

        private void add(int node) {
            if (this.size + 1 > this.capacity) {
                resize(this.size * 2); // 용량 초과시 2배로 증가
            }
            this.heap[this.size + 1] = node;

            // 들어가야 하는 위치 찾기
            // (this.size + 1) / 2 = 들어갈 부모의 인덱스
            int nodeIdx = this.size + 1;
            int parentIdx = (nodeIdx) / 2;

            while (this.heap[parentIdx] > node) {
                swap(parentIdx, nodeIdx);

                // 바뀐 인덱스
                nodeIdx = parentIdx;
                parentIdx = nodeIdx / 2;
            }

            this.size++;
        }

        private void delete() {
            if (this.size == 0 || this.heap[1] == 0) {
                throw new NoSuchElementException();
            }

            // root 제거 -> root 자리에 last node 옮김
            this.heap[1] = this.heap[this.size];

            int nodeIdx = 1;
            int childIdx0 = nodeIdx * 2;
            int childIdx1 = nodeIdx * 2 + 1;

            while (this.heap[nodeIdx] > this.heap[childIdx0] || this.heap[nodeIdx] > this.heap[childIdx1]) {
                int targetIdx = this.heap[childIdx0] <= this.heap[childIdx1] ? childIdx0 : childIdx1;
                swap(nodeIdx, targetIdx);
                nodeIdx = targetIdx;

                childIdx0 = nodeIdx * 2;
                childIdx1 = nodeIdx * 2 + 1;
            }
        }

        private int peek() {
            if (heap[1] == 0) {
                throw new NoSuchElementException();
            }

            return heap[1];
        }

        private void swap(int idx0, int idx1) {
            int val = this.heap[idx0];
            this.heap[idx0] = this.heap[idx1];
            this.heap[idx1] = val;
        }

        private int getSize() {
            return this.size;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            for(int i = 1; i <= this.size; i++) {
                int val = this.heap[i];
                builder.append(val + ", ");
            }

            if (builder.toString().length() > 0) {
                builder.delete(builder.length() - 2, builder.length());
            }

            return "[" + builder.toString() + "]";
        }
    }
}

