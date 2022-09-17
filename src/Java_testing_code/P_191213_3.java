package Java_testing_code;

public class P_191213_3 { //args[] 이용해서 입력값에 따라 달라지게 하기(find/replace...이용해서도 비슷한 기능 가능)

	public static void main(String[] args) {
		
		double valueofSupply = Double.parseDouble(args[0]);
		double vatRates = 0.1;
		double expenseRates = 0.3;
		double vat = valueofSupply*vatRates;
		double total = valueofSupply+valueofSupply*vatRates;
		double expense = valueofSupply*expenseRates;
		double income = total-expense;
		
		System.out.println("Value of Supply :"+valueofSupply);
		System.out.println("VAT : "+vat);
		System.out.println("Total : "+total);
		System.out.println("Expense : "+expense);
		System.out.println("Income : "+income);		
		
		double dividend1 = income*0.5;
		double dividend2 = income*0.3;
		double dividend3 = income*0.2;
		
		System.out.println("Dividend 1 : "+dividend1);
		System.out.println("Dividend 2 : "+dividend2);
		System.out.println("Dividend 3 : "+dividend3);
		
		
	}

}
