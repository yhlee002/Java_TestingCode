package Java_testing_code;

import java.util.Arrays;

//clone을 통해 originalC와 이를 얕은 복사한 copyC, 깊은 복사한  deepC 생성 후 둘과의 equals 해보기(오버라이딩 필요)


//얕은 복사(Shallow Cloning)
class originalC implements Cloneable{
	String strC;
	int[] ArrC;
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone(); 
		//참조 변수의 경우 주소값만 복사(두 변수가 하나의 객체를 가리키게 되는 것)
		//Object.clone() : 객체를 새로 생성해서 복제해주되, 복제해줄때 primitive data-type이 아닌
		//reference-data type은 그 값에 주소값을 줌.
	}
	
	public boolean equals(Object obj) {
		originalC copyC = (originalC) obj;
		return (this.strC == copyC.strC && this.ArrC == copyC.ArrC);
	}
}


//깊은 복사(Deep Cloning)
class originalD implements Cloneable{ 
	String strD;
	int[] ArrD;
	
	public Object clone() throws CloneNotSupportedException{
		originalD copyD = (originalD) originalD.super.clone();
		//primitive type은 여기서 다 복제가 됨(값자체가 복제 - 서로 영향X)
		
		int[] copyArrD = this.ArrD.clone(); 
		//reference type은 heap영역에 있는 객체를 따로 복제를 해줌으로써 주소가 다른 새로운 객체를 참조하게 해줌
		copyD.ArrD = copyArrD;
		//copyD의 배열변수를 새로운 배열객체와 연결시켜줌
				
		return copyD;
		//super.clone()때문에 throws CloneNotSupportedException이 사용되는 것.
		//super에 해당하는 Object클래스가 Cloneable인터페이스를 구현(상속)하기로 되어있지 않기 때문에.
	}
	//originalD는 원래의 equals(Object의 메소드)를 사용할 것.
}




public class Practice_200411_equals_clone3 {
	public static void main(String[] args) throws CloneNotSupportedException {
		originalC oc = new originalC();
		
		//oc.strC = "Hello"
		//oc.originalArr = {1, 2, 3}
		oc.strC = "Hello";
		oc.ArrC = new int[3];
		for(int i = 0; i < oc.ArrC.length; i++) {
			oc.ArrC[i] = i+1;
		}
		
		originalC copyOc = (originalC) oc.clone();
		System.out.println(copyOc.equals(oc));
		System.out.println(oc.equals(copyOc));
		
		oc.ArrC[0] = 100;
		System.out.println("oc.ArrC[0] 변경 값 : "+copyOc.ArrC[0]);
		System.out.println(Arrays.toString(oc.ArrC)); //[100, 2, 3]
		System.out.println(Arrays.toString(copyOc.ArrC)); //[100, 2, 3]
		
		originalD od = new originalD();
		od.strD = "Bye";
		od.ArrD = new int[4];
		for(int i = 0; i <od.ArrD.length; i++) {
			od.ArrD[i] = (i+1)*100; //[100, 200, 300, 400, 500]
		}
		
		originalD copyOd = (originalD) od.clone(); //애초에 지정 클래스의 clone오버라이딩 메소드의 리턴타입을 지정 클래스로 둘 수도 있다.
		System.out.println(copyOd.equals(od));
		System.out.println(od.equals(copyOd));
		
		od.ArrD[0] = 500; //[500, 200, 300, 400, 500]
		
		System.out.println(Arrays.toString(od.ArrD)); //
		System.out.println(Arrays.toString(copyOd.ArrD)); //
		
		
		
		
		
	}
}
