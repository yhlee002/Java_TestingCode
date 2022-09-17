package Java_testing_code;
import java.util.Scanner; //System.in은 키보드와 연결된 표준 입력 스트림(STDIN;standard input stream)
public class P_200213_1 {
//알쏭달쏭 자바 예제(출력스트림)
	public static void main(String[] args) {
		//Scanner클래스의 next ...메소드 중 주로 쓰이는 것은 nextInt(), nextDouble(), next(), nextLine(), nextBoolean()
		//System.in은 키보드와 연결된 표준 입력 스트림(STDIN;standard input stream)

		//키보드에서 입력한 정숫값을 표시하기
		Scanner scan1 = new Scanner(System.in); 
		System.out.println("정수값 : ");
		int x = scan1.nextInt();
		System.out.println("입력된 정수값은 "+x+"입니다.");
		scan1.close();
		
		//입력된 값의 절대값 구하기
		Scanner scan2 = new Scanner(System.in);
		System.out.println("값을 입력하세요.");
		int y = scan2.nextInt();
		if(y>=0) {
			System.out.println("입력된 값은 : "+y);
		}else {
			System.out.println("입력된 값은 : "+ -y);
		}
		scan2.close();
		
		//키보드에서 입력한 정숫값에서 10을 더한 값과 10을 뺀 값을 표시하기
		Scanner scan3 = new Scanner(System.in);
		System.out.println("값을 입력하세요.");
		int z = scan3.nextInt();
		System.out.println("입력된 값에서 10을 더한 수는 "+(z+10)+"이며, 10을 뺀 수는 "+(z-10)+"입니다.");
		scan3.close();

		//키보드에서 입력한 정숫값에서 마지막 자릿수를 제외한 값과 마지막 자릿수 값만 표시하기
		Scanner scan4 = new Scanner(System.in);
		System.out.println("값을 입력하세요.");
		int a = scan4.nextInt();
		int a1 = a/10;
		System.out.println("입력된 값에서 마지막 자릿수를 제외한 값은 "+a1+"이며, 마지막 자릿수 값은"+(a%10)+"이다.");
		scan4.close();
		
		//2개의 실숫값을 입력받아 그 합과 평균을 표시하기
		Scanner scan5 = new Scanner(System.in);
		System.out.println("2개의 값을 입력하세요.");
		double b = scan5.nextDouble();
		double c = scan5.nextDouble();
		System.out.println("두 실수값의 합은 "+(b+c)+"이며, 두 실수값의 평균은 "+(b+c)/2+"이다.");
		scan5.close();
		
		//2개의 실숫값을 입력받아 두 값간의 차를 구하기(값의 교환을 통한 절댓값구하기)
		Scanner scan6 = new Scanner(System.in);
		System.out.println("2개의 값을 입력하세요.");
		int d = scan6.nextInt();
		int e = scan6.nextInt();
		if(d<e) {
			int t = d; d = e; e = t;
		}
		System.out.println("두 값의 사이는 "+(d-e)+"이다.");
		//조금 다른 방법(조건연산자 사용)
		int de = d>e?d-e:e-d; //d>e일때는 d-e, d<e일때는 e-d가 변수의 값이 되도록 초기화
		System.out.println("두 값의 사이는"+de+"이다.");
		scan6.close();
		
		//삼각형의 밑변과 높이를 입력받아 삼각형의 넓이를 구하기(double형의 값 입력)
		Scanner scan7 = new Scanner(System.in);
		System.out.println("밑변 : ");
		double f = scan7.nextDouble();
		System.out.println("높이 : ");
		double g = scan7.nextDouble();
		System.out.println("밑변 길이는 "+f+"이고 높이는 "+g+"인 삼각형의 넓이는 "+(f*g)/2);
		scan7.close();
		
		//구의 반지름을 입력받아 겉넓이와 부피 구하기(final변수 사용)
		Scanner scan8 = new Scanner(System.in);
		double PI = Math.PI;
		System.out.println("구의 반지름 : ");
		double h = scan8.nextDouble();
		System.out.println("구의 겉넓이는 "+(2*PI*h)+"이고, 부피는 "+(PI*h*h)+"이다.");
		//final 변수는 원칙적으로 초기화해야하며 선언 시 초기화하지 않았다면 한번만 변수값을 넣을 수 있다. 또한 일반적으로 대문자의 이름을 갖는다.
		scan8.close();
		
		//next()와 nextLine()이용해서 성과 이름, 주소를 입력하여 표시하는 프로그램 작성
		Scanner scan9 = new Scanner(System.in);
		System.out.println("성과 이름 : ");
		String i = scan9.next();
		String j = scan9.next();
		Scanner scan10 = new Scanner(System.in);
		System.out.println("주소 : ");
		String k = scan10.nextLine();
		System.out.println("입력하는 분의 성함은 "+i+" "+j+"이며, 주소는 다음과 같습니다."+k);
		scan9.close();
		scan10.close();
		//next()는 공백으로 문자열을 구분. nextLine()은 공백도 포함하여 한 줄의 입력을 문자열로 읽음


	}	
}
