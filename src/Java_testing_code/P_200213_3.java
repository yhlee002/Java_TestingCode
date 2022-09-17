package Java_testing_code;
import java.util.Scanner;
public class P_200213_3 {
//알쏭달쏭 자바 예제(if-then문, if-else if문, while문, do-while문문)
	public static void main(String[] args) {
		//2개의 변수 a,b의 값을 읽어서 대소 관계를 나타내는 프로그램 작성
		Scanner scan1 = new Scanner(System.in);
		System.out.println("a의 값 : ");
		int a = scan1.nextInt();
		System.out.println("b의 값 : ");
		int b = scan1.nextInt();
		System.out.print(a>b ? "a>b" : "a<b");
		scan1.close();
		
		//5로 나누어떨어지는 값을 입력할때까지 입력값을 입력하게 하는 프로그램 작성
		Scanner scan2 = new Scanner(System.in);
		int c;
		do {
			System.out.println("값을 입력하세요.");
			c = scan2.nextInt();
			if(c%5 !=0)
			System.out.println("이 값은 5로 나누어떨어지지 않습니다.");
		}while(c%5 != 0);
		if(c%5 == 0) {
			System.out.println("이 값은 5로 나누어떨어집니다.");
		}	
		scan2.close();
		//

	}

}
