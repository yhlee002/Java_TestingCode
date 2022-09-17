package Java_testing_code;
//인자로서 배열 사용, 하나의 인자로 여러 값 받기 가능

class calculator2{
	
	int[] oprands;
	
	public void setOprands(int[] oprands) {
		this.oprands = oprands;
	}
	
	public void sum() {
		int total = 0;
		for(int value : this.oprands) {
			total += value;
		}
		System.out.println("Total : "+total);
	}
	
	public void avg() {
		int total = 0;
		for(int value : this.oprands) {
			total += value;
		}
		System.out.println("Total : "+total/oprands.length);
	}
	
}
public class P_200214_2 {

	public static void main(String[] args) {
	calculator2 cal = new calculator2();
	cal.setOprands(new int[] {10,20}); //int 앞의 new의 역할은? -> 생성자
	cal.sum();
	cal.avg();
	
	cal.setOprands(new int[] {50,16});
	cal.sum();
	cal.avg();
	
	}

}
