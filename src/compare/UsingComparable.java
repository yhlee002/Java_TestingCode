package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class TypeA implements Comparable<TypeA>{
	int x;
	TypeA(int num){
		this.x = num;
	}
	@Override
	public int compareTo(TypeA o) {
		if(this.x > o.x) {return 1;}
		else if(this.x < o.x) {return -1;}
		else if(this.x == o.x) { return 0;}
		return 0;
	}

}

public class UsingComparable {
	public static void main(String[] args) {
		List<TypeA> list = new ArrayList<>();
		//list에 TypeA 객체들을 넣는 과정
		list.add(new TypeA(20));
		list.add(new TypeA(15));
		list.add(new TypeA(30));
		list.add(new TypeA(55));
		System.out.println("Collections.sort() 사용 전");
		for(TypeA a : list) {
			System.out.print(a.x+" ");
		}
		System.out.println("\nCollections.sort() 사용 후");
		Collections.sort(list);
		for(TypeA a : list) {
			System.out.print(a.x+" ");
		}
	}
}
