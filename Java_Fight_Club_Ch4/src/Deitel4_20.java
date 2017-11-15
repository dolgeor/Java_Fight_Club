import java.util.Scanner;

public class Deitel4_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double hourlyRates;
		int hours;
		do {
			System.out.print("Enter the hourly rates :");
			hourlyRates = input.nextDouble();
			System.out.print("Enter the hours :");
			hours = input.nextInt();
			if (hours >= 0 && hourlyRates >= 0) {
				System.out.println("Your earn is :"
						+ ((hours > 40) ? 40 * hourlyRates + 1.5 * (hours - 40) * hourlyRates : hours * hourlyRates)
						+ " $");
			}
		} while (hours >= 0 && hourlyRates >= 0);
		input.close();

	}

}
