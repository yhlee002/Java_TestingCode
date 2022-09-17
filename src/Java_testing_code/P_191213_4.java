package Java_testing_code;

public class P_191213_4 { //조건문

	public static void main(String[] args) {
		
		double valueofSupply = Double.parseDouble(args[0]);
		double vatRates = 0.1;
		double expenseRates = 0.3;
		double vat = valueofSupply*vatRates;
		double total = valueofSupply+valueofSupply*vatRates;
		double expense = valueofSupply*expenseRates;
		double income = total-expense;	
		
		double dividend1; //변수는 if문 전에 써놓아야 if문과 외부까지 모두 적용됨
		double dividend2;
		double dividend3;
		
		if(income > 10000.0) {
			dividend1 = income*0.5; //변수로 이미 지정했기 때문에 앞에 double(변수 데이터 타입 지정)을 붙이지 않음
			dividend2 = income*0.3;
			dividend3 = income*0.2;
		}else{
			dividend1 = income*1;
			dividend2 = income*0;
			dividend3 = income*0;
		}
		
		System.out.println("Value of Supply :"+valueofSupply);
		System.out.println("VAT : "+vat);
		System.out.println("Total : "+total);
		System.out.println("Expense : "+expense);
		System.out.println("Income : "+income);	
		System.out.println("Dividend 1 : "+dividend1);
		System.out.println("Dividend 2 : "+dividend2);
		System.out.println("Dividend 3 : "+dividend3);
		
		
	}

}
