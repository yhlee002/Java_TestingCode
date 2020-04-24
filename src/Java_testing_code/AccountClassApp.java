package Java_testing_code;
import javax.swing.JOptionPane;

class dividendingApp{

	static double valueofSupply;
	static double vatRates;
	static double expenseRates;

	public static double getTotal() {
		return valueofSupply+getVAT();
	}
	public static double getExpense() {
		return valueofSupply*expenseRates;
	}
	public static double getVAT() {
		return valueofSupply*vatRates;
	}
	public static double getIncome() {
		return getTotal() - getExpense();
	}
	
	public static void print() {
		
		System.out.println("Value of Supply : "+valueofSupply);
		System.out.println("VAT Rates : "+vatRates+", "+"VAT : "+getVAT());
		System.out.println("Total : "+getTotal());
		System.out.println("Expense : "+getExpense());
		System.out.println("Income : "+getIncome());
		System.out.println("==============================");
		System.out.println("Dividend YoungHyun : "+AccountClassApp.YH);
		System.out.println("Dividend HyeWon : "+AccountClassApp.HW);	
		}
}
public class AccountClassApp {
	public static double YH;
	public static double HW;

	public static void main(String[] args) {
		dividendingApp.valueofSupply = Double.parseDouble(JOptionPane.showInputDialog("Value Of Supply?"));
		dividendingApp.vatRates = Double.parseDouble(JOptionPane.showInputDialog("VAT Rates?"));
		dividendingApp.expenseRates = Double.parseDouble(JOptionPane.showInputDialog("Expense Rates?"));

		if(dividendingApp.valueofSupply<50000) {
			YH = dividendingApp.getIncome()*0.5;
			HW = dividendingApp.getIncome()*0.5;
		}else {
			YH = dividendingApp.getIncome()*0.3;
			HW = dividendingApp.getIncome()*0.7;}
		
		dividendingApp.print();
		}
}


