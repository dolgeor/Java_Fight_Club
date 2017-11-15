import java.util.Scanner;

public class Deitel4_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int miles;
		int gallon = 0;
		int totalM = 0;
		int totalG = 0;

		System.out.print("Press -1 to stop\n");
		System.out.print("Enter miles:");
		miles = input.nextInt();
		if (miles != -1) {
			System.out.print("Enter gallons:");
			gallon = input.nextInt();
			System.out.printf("Average consumption = %.2f miles/gallon%n%n", (float) miles / gallon);
		}

		while (!(miles == -1 || gallon == -1)) {
			totalM += miles;
			totalG += gallon;
			System.out.print("Press -1 to stop\n");
			System.out.print("Enter miles:");
			miles = input.nextInt();
			if (miles == -1)
				break;
			System.out.print("Enter gallons:");
			gallon = input.nextInt();
			if (gallon == -1)
				break;
			System.out.printf("Average consumption = %.2f miles/gallons%n%n", (float) gallon / miles);

		}
		System.out.printf("Total average consumption = %.2f miles/gallon%n%n", (float) totalM / totalG);
		input.close();

	}

}
