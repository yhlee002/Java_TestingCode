package Java_testing_code;
import java.util.Random;
public class P_200213_2 {
//알쏭달쏭 자바 예제(난수)
	public static void main(String[] args) {

		//난수 생성(java.util.Random클래스 사용) 
		/*Random클래스의 next ...메소드 중 주로 쓰이는 것은 nextInt(), nextInt(n), nextDouble(), nextBoolean()
			1.Random.nextInt(n) : 0이상 n미만의 랜덤한 정수값을 생성 cf. nextInt()와는 상이
			2.Random.nextDouble() : 0.0이상 1.0미만
		*/
		
		//한자리 양의 정숫값을 랜덤으로 생성해서 표시하기
		Random rand1 = new Random();
		int a = rand1.nextInt(9)+1;
		System.out.println(a);
		
		//한 자리 음의 정수값을 랜덤으로 생성해서 표시하기
		Random rand2 = new Random();
		//int b = -1*rand2.nextInt(9)-1;//-9~-1
		int b = rand2.nextInt(9) - 9;
		System.out.println(b);
		
		//두 자리 양의 정숫값을 랜덤으로 생성해서 표시하기
		Random rand3 = new Random();
		int c = rand3.nextInt(90) + 10; //10~99 = 0~89 + 10
		System.out.println(c);
		
		//'-15.0이상 15.0이하'의 실숫값을 랜덤으로 생성해서 소숫점아래 두자리까지 표시하기
		Random rand4 = new Random();
		double d = 30*rand4.nextDouble()-15; //0.0-1.0 *30 = 0.0-30.0 - 15 = -15.0-15.0
		System.out.printf("%.2f", d);
		
	}

}
