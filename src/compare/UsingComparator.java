package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class myComparator implements Comparator<TypeB>{ //TypeA 자료형의 데이터를 정렬하는 myComparator 생성

	@Override
	public int compare(TypeB o1, TypeB o2) {
		if(o1.x>o2.x) {return -1;} //양수일때만 변경(배열에서의 순서는 o1, o2인데 더 큰 수를 오른쪽에 가게 함으로써 오름차순으로 만드는 것)
		else if(o1.x == o2.x) {return 0;}
		else {return -1;}
	}
}

class TypeB {
	int x;
}

public class UsingComparator {
	public static void main(String[] args) {
		List<TypeB> aList = new ArrayList<>();
		//aList에 TypeA 객체들을 넣는 과정 생략

		myComparator myComp = new myComparator();

		Collections.sort(aList, myComp); //myComp 이라는 정렬 기준을 사용해 sort
	}
}