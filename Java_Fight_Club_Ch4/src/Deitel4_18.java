import java.util.Scanner;

public class Deitel4_18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int accountNumber;
		int beginBalance = 0;
		int charges = 0;
		int credits = 0;
		int creditLimit;
		int balance;
		
		System.out.print("Enter account nr: ");accountNumber = input.nextInt();
		System.out.print("Enter begin balance: "); beginBalance = input.nextInt();
		System.out.print("Enter charges: "); charges = input.nextInt();
		System.out.print("Enter credits: "); credits = input.nextInt();
		System.out.print("Enter credit limit: "); creditLimit = input.nextInt();
		
		balance = beginBalance + charges - credits;
		
		System.out.println("Balance: " + balance);
		if(balance < creditLimit) {
			System.out.println("Credit limit exceeded");
		}
		input.close();
	}
}
