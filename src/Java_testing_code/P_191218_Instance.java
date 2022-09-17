package Java_testing_code;
class AccountingPractice { //기존에 있던 class 파일이 아니라서 public class 로 지정했을때 오류 발생
	public double valueofSupply; //class 파일 내에 적용되도록 위치를 옮겨옴(main method 내에서)
	public double vatRates;
	public double expenseRates;
	
	public double getVAT() {
		return valueofSupply*vatRates;
	}
	public double getIncome() {
		return getTotal() - getExpense();
	}
	public double getTotal() {
		return valueofSupply+getVAT();
	}
	public double getExpense() {
		return valueofSupply*expenseRates;
	}
	public double dividend1() {
		return getIncome()*0.5;
	}
	public double dividend2() {
		return getIncome()*0.3;
	}
	public double dividend3() {
		return getIncome()*0.2;
	}
	
	public void print() {
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

public class P_191218_Instance {
		public static void main(String[] args) {

		AccountingPractice A1 = new AccountingPractice(); //class를 복제하여 instance 만드는 코드

		A1.valueofSupply = 75000;
		A1.vatRates = 0.1;
		A1.expenseRates = 0.3;
		A1.print();
		
		AccountingPractice A2 = new AccountingPractice();
		
		A2.valueofSupply = 97000;
		A2.vatRates = 0.07;
		A2.expenseRates = 0.4;
		A2.print();
		
	}

}
