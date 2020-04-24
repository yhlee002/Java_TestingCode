package Java_testing_code;
class referenceApp{ //public class : 자체의 파일이 존재해야 하나봄. 그냥 class 는 인출되지 X
	public static String variable1 = "Hi, I'm Variable";
	public String variable2 = "Hi, I'm Variable. but, I'm Variable of non-static type";
	
	public static void Method1() { //method는 void를 수반(class내의 member를 나타내는 창에도 void로 나타남
		System.out.println("Method1 : "+variable1);	
	}
	public void Method2() {
		System.out.println("Method2 : "+variable2);
	}
}
public class Practice_191218_StaticApp_1 { 

	public static void main(String[] args) { //main method는 static을 수반
		//static type의 main method라서 instance type의 field나 method를 받지 X
		System.out.println(referenceApp.variable1);
		referenceApp.Method1();
		
		referenceApp R1 = new referenceApp(); //instance를 생성하고 나면 static, non-static 모두 소환 가능. 지명 방식은 상이
		System.out.println(referenceApp.variable1); //R1.variable1보다는 referenceApp.variable1로 접근하기를 추천
		System.out.println(R1.variable2);
		referenceApp.Method1(); //R1.Method1()보다는 referenceApp.Method()로 접근하기를 추천
		R1.Method2();
		
			
		
	}

}
