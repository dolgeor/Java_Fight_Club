import java.util.Scanner;

public class Deitel5_17 {
	static final double[] prices = { 2.98, 4.50, 9.98, 4.49, 6.87 };

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sales[] = new int[5];
		int key;
		do {
			System.out.print("Enter number of product [1,5] or -1 to stop:");
			key = input.nextInt();
			switch (key) {
			case 0:
				System.out.print("Enter quantity of product0: ");
				sales[0] = input.nextInt();
				break;
			case 1:
				System.out.print("Enter quantity of product1: ");
				sales[1] = input.nextInt();
				break;
			case 2:
				System.out.print("Enter quantity of product2: ");
				sales[2] = input.nextInt();
				break;
			case 3:
				System.out.print("Enter quantity of product3: ");
				sales[3] = input.nextInt();
				break;
			case 4:
				System.out.print("Enter quantity of product4: ");
				sales[4] = input.nextInt();
				break;
			default:
				System.out.println("This product does not exist");
				break;
			}
		} while (key != -1);
		bill(sales);
		input.close();
	}

	public static void bill(int... sales) {
		double cash = 0.0;

		for (int i = 0; i < sales.length; i++) {

			System.out.printf("Product%d: $%5.2f * %3d | $%5.2f%n", i, prices[i], sales[i], sales[i] * prices[i]);
			cash += sales[i] * prices[i];
		}
		System.out.println("-------------------------------");
		System.out.printf("Total:                   $%5.2f%n", cash);

	}
}
