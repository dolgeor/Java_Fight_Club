
import java.util.Scanner;

public class Deitel5_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, m;
		do {
			System.out.println("Enter quantity of numbers:");
			a = input.nextInt();
		} while (a <= 0);
		System.out.print("Enter a number:");
		m = input.nextInt();
		for (int i = 1; i < a; i++) {
			System.out.print("Enter a number:");
			b = input.nextInt();
			m = min(m , b);
		}
	

		System.out.println("Smallest value is " + m);
		input.close();
	}

	public static int min(int a, int b) {
		if (b < a) {
			return b;
		}
		return a;
	}
}
