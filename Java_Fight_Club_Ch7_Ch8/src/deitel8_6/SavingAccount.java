package deitel8_6;

public class SavingAccount {

	private static double annualInterestRate;
	private double savingsBalance;

	public SavingAccount(double balance) {
		setSavingsBalance(balance);
	}

	public void calculateMonthlyInterest() {
		setSavingsBalance(savingsBalance * (1 + annualInterestRate / 12));
	}

	public static void modifyInterestRate(double newRate) {
		if (newRate >= 0 && newRate <= 1) {
			annualInterestRate = newRate;
		} else {
			System.out.println("Incorrect value of rate");
		}
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		if (savingsBalance >= 0) {
			this.savingsBalance = savingsBalance;
		} else {
			System.out.println("Incorrect value of balance");
		}
	}

	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	@Override
	public String toString() {
		return String.format("Balance = %.2f $ Anual rate = %.2f %%%n", getSavingsBalance(), getAnnualInterestRate());
	}
}
