package Java_testing_code;
//오버라이딩(Overriding)과 오버로딩(Overloading)

import java.util.Scanner;

class calculator{
	int x, y;
	public calculator(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void sum() {
		System.out.println("x + y = "+(x+y));
	}
	public void avg() {
		System.out.println("x와 y의 평균 = "+(x+y)/2);
	}
	public void A() {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		System.out.println("A()에 입력된 값은 "+a+"이다.");
		
		sc.close();
	}
	public void A(String b) { //이미 있는 A()와 이름, return값이 같고 매개변수만 다른 overloading
		System.out.println("A(String b)에 입력된 값은 "+b+"이다.");
	}
}

class subcalculator extends calculator{
	public subcalculator(int x, int y) {
		super(x,y);
		//상위 클래스의 매개변수를 가지는 생성자를 참조하겠다고 명시해주면 상위 클래스에 기본 생성자가 없더라도 가능
	}
	public void sum() {
		System.out.println("2(x + y) = "+2*(x+y)); //상속받은 클래스의 메소드를 부분적으로 수정(overriding)
	}
}
public class Practice_200214_1 {

	public static void main(String[] args) {
		calculator c = new calculator(10,20);
		c.sum();
		c.avg();
		
		System.out.println("A()에 들어갈 값을 입력하시오.");
		
		c.A();
		c.A("hello");
		
	}
}
