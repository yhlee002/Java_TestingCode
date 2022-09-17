package Java_testing_code;

public class P_191221 {
	static int a;
	static int b;

	public static void Method1() {
		System.out.println("Hello, I'm Method 1");
	}
	public void Method2() {
		a = 14; b = 30;
		
		
		
		System.out.println("Hello, I'm Method 2"+"Variable A = "+a+", Variable B ="+b);
	}
	public void Method3() { //이 메소드를 static으로 할거면 이에 들어가는 전역변수인 a와 b도 static int로 변환
		a = 14; b = 30;
		System.out.println(a+b); 
	}
	public static int Method4(int a, int b) { //메소드 앞에 데이터타입을 입력했어도 값에도 int 붙여야함
		a = 14; b = 30;
		return a+b;
	}
	public static void  Method6(int a, int b) { //void 메소드의 경우 메소드 네임 지정란의 괄호에 값을 표시하지 않아도 괜찮음(아래 println에서 쓰면 되니까)
		a = 14; b = 30;		
		System.out.println(a+"Hello"+b); //void 메소드에는 데이터타입 지정 X	
	}
//	public Method7(int a, int b) { //return type(return 값의 data type을 입력하지 않을 경우 오류)
//		a = 14;
//		b = 30;
//		return a/b;
//	}
	public int Method8() {
		a = 14; b = 30;	
		return a+b;
	}
	
	public static void main(String[] args) { //String[] args = new String[n]가능, args = new String[n]가능
		args = new String[5];
		int i = 0;
		args[0] = "Hello";
		args[1] = "Hell";
		args[2] = "Hel";
		args[3] = "He";
		args[4] = "H";
		
		while(i<5) {
		System.out.print(args[i]);
		i = i + 1;
		}
		
		int a = 1;
		int b = 0;
		int[] ArrayLoopValue = new int[10];
		ArrayLoopValue[0] = a+b;
		ArrayLoopValue[1] = a+b+a;
		ArrayLoopValue[2] = a+b+a+b;
		ArrayLoopValue[3] = a+b+a+b+a;
		ArrayLoopValue[4] = a+b+a+b+a+b;
		ArrayLoopValue[5] = a+b+a+b+a+b+a;
		ArrayLoopValue[6] = a+b+a+b+a+b+a+b;
		ArrayLoopValue[7] = a+b+a+b+a+b+a+b+a;
		ArrayLoopValue[8] = a+b+a+b+a+b+a+b+a+b;
		ArrayLoopValue[9] = a+b+a+b+a+b+a+b+a+b+a;
			
		while(i<ArrayLoopValue.length) {
			System.out.print("ArrayLoop : "+ArrayLoopValue[i]+"\n");			
			i = i + 1;			
		}

		System.out.println(Method4(a, b));
		Method6(a, b);
	}
}