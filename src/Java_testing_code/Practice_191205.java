package Java_testing_code;

public class Practice_191205 {

	public static void main(String[] args) {
		//String : use "", Number : don't use ""
		System.out.println("Hello Java");
		System.out.println("\"Hello Java\"");
		System.out.println("\"Hello \njava\"");
		System.out.println("1000000".length());
		System.out.println(10+10);
		System.out.println(10*10);
		System.out.println(100-90);
		
		//Variable(변수)
		int a=16; //int(integer : 정수)
		System.out.println(a);
		double b = 15.4; //double(real number : 실수)
		System.out.println(b); 
		String c = "Hello Java"; //String : 문자열
		System.out.println(c);
		String d = "\"Hello Java\""; //\" : 일반 문자열로 취급 , \n(escape) : 줄바꿈
		System.out.println(d);
		System.out.println("\"Hello Hyewon ... bye.".replace("Hyewon", "Younghyun")); //replace (A, B) : A�� B�� ��ü
		System.out.println(c.replace("Hello", "Bye"));
		
		//math. : 자주 쓰이는 수학 연산 명령어들을 모아둔 클래스
		System.out.println(Math.PI);
		System.out.println(Math.floor(Math.PI));
		System.out.println(Math.ceil(Math.PI));
	}

}
