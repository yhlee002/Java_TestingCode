package Java_testing_code;
class Foo{
	public static String classVar = "I class var";
	public String instanceVar = "I instance var";
	
	public static void classMethod() {
		System.out.println(classVar);
//		System.out.println(instanceVar); //static속성의 method에서는 static field만 소환 가능, non-static field를 소환할 수 없음
	}
	public void instaceMethod() { //non-static속성의 method에서는  static field와 non-static field 모두 소환 가능
		System.out.println(classVar);
		System.out.println(instanceVar);
	}
}
public class P_191218_StaticApp_2 {

	public static void main(String[] args) {
		System.out.println(Foo.classVar); //class 소속인 변수는 불러올 수 있음 → I class var 인출
//		System.out.println(Foo.instanceVar); //instance 소속인 변수는 불러올 수 없음
		Foo.classMethod(); //변수 classVar 인출. 즉, I class var 인출
//		Foo.instanceMethod(); //이 메소드는 instance 메소드기 때문에 class에서의 접근은 불가능
		
//		static String classVar와 static classMethod()는 링크되어져 한쪽이 수정되어도 다른쪽이 영향받음
//		String instanceVar와 instanceMethod()는 그 자체로 값까지 복제된 것으로 한쪽이 수정되어도 다른쪽 영향 X
//		즉, static 변수와 메소드는 기존 class와 결국 하나. non-static변수와 메소드는 개별적인 각각의 instance의 것
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		//static 변수는 클래스명으로 접근해야함(원래 f2.classVar보다는 foo.classVar)
		f2.classVar = "Hello I'm class var"; //f2에서 static변수를 변경한 것. → Hello I'm class var 인출
		System.out.println(Foo.classVar); //→ Hello I'm class var 인출
		System.out.println(f2.classVar); //→ Hello I'm class var 인출
		System.out.println(f1.instanceVar);
		f2.instanceVar = "Hello I'm instance var"; //→ Hello I'm instance var 인출
		System.out.println(f2.instanceVar); //→ I instance var 인출
		System.out.println(f1.instanceVar); //→ I instance var 인출
	}

}
