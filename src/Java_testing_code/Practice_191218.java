package Java_testing_code;

public class Practice_191218 {

	public static double valueofSupply; //전역변수
	public static double vatRates;
	public static double expenseRates;
	public static void main(String[] args) {
		valueofSupply = 90000; //Double.parseDouble(args[0])를 넣어 args를 사용할 수도 있음
		vatRates = 0.1; //전역변수를 메인 메소드 내에 언급
		expenseRates = 0.3;
		print();
		

	}
	public static double getVAT() {
		return valueofSupply*vatRates;
	}
	public static double getIncome() {
		return getTotal() - getExpense();
	}
	public static double getTotal() {
		return valueofSupply+getVAT();
	}
	public static double getExpense() {
		return valueofSupply*expenseRates;
	}
	public static double dividend1() {
		return getIncome()*0.5;
	}
	public static double dividend2() {
		return getIncome()*0.3;
	}
	public static double dividend3() {
		return getIncome()*0.2;
	}
	
	public static void print() {
		System.out.println("Value of Supply : "+valueofSupply);
		System.out.println("VAT : "+getVAT());
		System.out.println("Total : "+getTotal());
		System.out.println("Expense : "+getExpense());
		System.out.println("Income : "+getIncome());
		System.out.println("Dividend 1 : "+dividend1());
		System.out.println("Dividend 1 : "+dividend2());
		System.out.println("Dividend 1 : "+dividend3());
	}

}
