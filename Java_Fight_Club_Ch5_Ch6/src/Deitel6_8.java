import java.util.Scanner;

public class Deitel6_8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String bill = "";
		String car = "";
		String number = "";
		int hour = 0;
		double totalIncome = 0.0;
		do {
			if(hour !=0 ) {
				bill+=String.format("%s - %s : $%2.2f%n", car.toUpperCase(),number.toUpperCase(),calculateCharges(hour));
				totalIncome+=calculateCharges(hour);
			}
			System.out.print("Enter model of car:");
			car =input.next();
			System.out.print("Enter number plate:");
			number =input.next();
			System.out.print("Enter park hours:");
			hour =input.nextInt();
			
		} while(hour !=-1  );
		bill+=String.format("----------------\nTotal:        $%.2f",totalIncome);
		System.out.println(bill);
		input.close();
	}

	public static double calculateCharges(int hour) {
		return (hour <= 3 ? 2.0 : 2.0 + (hour - 3) * 0.5) > 10 ? 10 :
			(hour <= 3 ? 2.0 : 2.0 + (hour - 3) * 0.5);
	}
	
}
