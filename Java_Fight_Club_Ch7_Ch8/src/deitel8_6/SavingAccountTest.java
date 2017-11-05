package deitel8_6;

public class SavingAccountTest {

	public static void main(String[] args) {

		SavingAccount saver1 = new SavingAccount(2000);
		SavingAccount saver2 = new SavingAccount(3000);
		
		System.out.println("Saver1: " + saver1);
		System.out.println("Saver2: " + saver2);
		
		saver1.modifyInterestRate(0.04);////?????????/
		
		System.out.println("Rate : " + saver1.getAnnualInterestRate());
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		System.out.println("Saver1: " + saver1);
		System.out.println("Saver2: " + saver2);
		
		saver1.modifyInterestRate(0.05);////?????????/
		
		System.out.println("Rate : " + saver1.getAnnualInterestRate());
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		System.out.println("Saver1: " + saver1);
		System.out.println("Saver2: " + saver2);
		
		
	}

}
