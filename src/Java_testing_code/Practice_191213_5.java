package Java_testing_code;

public class Practice_191213_5{ //

	public static void main(String[] args) {
		
		double valueofSupply = Double.parseDouble(args[0]);
		double vatRates = 0.1;
		double expenseRates = 0.3;
		double vat = valueofSupply*vatRates;
		double total = valueofSupply+valueofSupply*vatRates;
		double expense = valueofSupply*expenseRates;
		double income = total-expense;	
		
		double[] dividendRates = new double[3]; //3개까지 담기는 수납서랍
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;

		double[] dividend = new double[3];
		dividend[0] = income*dividendRates[0];
		dividend[1] = income*dividendRates[1];
		dividend[2] = income*dividendRates[2];
		
		
		
		System.out.println("Value of Supply :"+valueofSupply);
		System.out.println("VAT : "+vat);
		System.out.println("Total : "+total);
		System.out.println("Expense : "+expense);
		System.out.println("Income : "+income);	
		System.out.println("Dividend 1 : "+dividend[0]);
		System.out.println("Dividend 2 : "+dividend[1]);
		System.out.println("Dividend 3 : "+dividend[2]);
		
		
	}

}
