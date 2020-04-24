package Java_testing_code_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
 * 객체의 정렬 기준을 명시하는 두 가지 방법 : Comparable, Comparator
 * (1)Interface Comparable(정렬 수행시 기본적으로 적용되는 정렬 기준이 되는 메소드를 정의하는 Interface)
 *	- package : java.lang.Comparable
 *  - java에서 제공되는 정렬이 가능한 클래스들은 모두 Comparable를 구현하고 있으며, 정렬시 이에 맞게 정렬된다.
 *  	ex. Integer, Double :  오름차순 정렬 / String :  사전순 정렬
 *  [구현 방법] : 정렬할 객체에 Interface Comparable을 구현(compareTo()를 overriding)
 *  			//정렬하고자 하는 객체의 청사진이 되는 클래스에 Interface Comparable을 구현한 뒤, 이 클래스를 인스턴스화.
 *  			//이렇게 인스턴스화 된 객체들이 모인 배열 혹은 리스트를 sort를 통해 정렬
 *  	cf.compareTo() : 현재 객체 < 매개변수로 받은 객체 : 음수 리턴(해당 속성 혹은 값에 있어서 내림 차순), 
 *  					현재 객체 > 매개변수로 받은 객체 : 양수 리턴(오름차순), 둘이 같을 경우 0리턴
 *  				→ 음수 또는 0이 리턴될 경우 객체의 자리가 그대로 유지되며, 양수인 경우 두 객체의 자리가 변경된다.
 *  [사용 방법] : Arrays.sort(array), Collections.sort(list)
 * 
 * (2)Interface Comparator(정렬 가능한 클래스. 즉, Comparable을 구현한 클래스들의 기본 정렬 기준과 다르게
 * 	정렬하고 싶을 때 사용하는 Interface)
 * - package : java.util.Comparator
 * - 주로 익명 클래스로 사용되며, 기본적인 정렬 방법인 오름차순 정렬을 내림차순으로 바꾸고 싶을 때 많이 사용
 * [구현 방법] : Interface Comparator를 구현(compare()를 overriding한) 클래스(이를 임의로 myComparator라고 한다. - ln28)를 작성.
 * 		cf.compare() : 첫번째 인자 > 두번째 인자 : 양수 리턴, 첫번째 인자(객체) < 두번째 인자(객체) : 음수 리턴, 
 * 						둘이 같을 경우 0리턴
 * 					→ 음수 또는 0이면 객체의 자리가 그대로 유지되며, 양수인 경우 두 객체의 자리가 변경된다.
 * 					(Integer.compare(x, y)와 동일한 개념(return(x<y)? -1 : ((x == y) ? 0 : 1);
 * 					*내림차순 정렬의 경우 두 매개변수의 위치를 바꿔준다.(Integer.compare(y, x);
 * [사용 방법] : Arrays.sort(array, myComparator), Collections.sort(list, myComparator)
 */
public class TypeA implements Comparable<TypeA>{
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
	public static void main(String[] args) {
		List<TypeA> list = new ArrayList<TypeA>();
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
