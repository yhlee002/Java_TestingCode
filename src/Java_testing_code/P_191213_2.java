package Java_testing_code;

public class P_191213_2 { //변수 정리

	public static void main(String[] args) {
		
		double valueofSupply = 10000.0;
		double vatRates = 0.1;
		double expenseRates = 0.3;
		double vat = valueofSupply*vatRates;
		double total = valueofSupply+valueofSupply*vatRates;
		double expense = valueofSupply*expenseRates;
		double income = total-expense;
		
		double dividend1 = income*0.5;
		double dividend2 = income*0.3;
		double dividend3 = income*0.2;
		
		System.out.println("Value of Supply :"+valueofSupply);
		System.out.println("VAT : "+vat);
		System.out.println("Total : "+total);
		System.out.println("Expense : "+expense);
		System.out.println("Income : "+income);
		System.out.println("Dividend 1 : "+dividend1);
		System.out.println("Dividend 1 : "+dividend2);
		System.out.println("Dividend 1 : "+dividend3);
		
		
	}

}
