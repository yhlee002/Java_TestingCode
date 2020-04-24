package Java_testing_code;
import javax.swing.JOptionPane;
public class Practice_191209 {

	public static void main(String[] args) { //args은 String으로 지정되어 있음
		

		//정수 → 실수 : 자동 변환
		double A = 5;
		double B = (double)7;
		System.out.println(A+B);
		
		//실수 → 정수 : 자동 변환 불가. 명시할 경우 변환
		int C = (int) 7.5;
		System.out.println(C);
		
		//정수, 실수 → 문자열 : Integer.toString(), Double.toString()
		String D = Integer.toString(15);
		System.out.println(D);
		
		String E = Double.toString(6.3);
		System.out.println(E);
		System.out.println(E.getClass()); //.getClass() : 데이터 형태를 밝혀줌
		
		//문자열 → 정수, 실수 (arguments 사용. args[0]은 "631", args[1]은 "555"로 지정)
		String F = args[0];
		System.out.println(Double.parseDouble(F)); //Double.parseDouble()
		
		String G = args[1];
		System.out.println(Integer.parseInt(G)); //Integer.parseInt()
		
		//변수를 만들지 않고도 가능, args[2]를 I라는 변수로 만들어 표현 가능(args[2]는 137로 지정)
		String I = args[2];
		System.out.println(Integer.parseInt(I));
		System.out.println(Double.parseDouble(I));
		
		//대화상자 만들기(변수 H)
		String H = JOptionPane.showInputDialog("???");
		System.out.println(H);
		System.out.println(Double.parseDouble(H));
		System.out.println(Integer.parseInt(H));
		

	}

}
