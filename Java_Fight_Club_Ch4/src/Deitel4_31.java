import java.util.Scanner;

public class Deitel4_31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int b;

		System.out.print("Enter the positive binary number: ");
		b = input.nextInt();
		if (isPositiveBinary(b)) {
			System.out.println("Number in decimal is: " + decimal(b));
		} else {
			System.out.println("It's not positive binary number");
		}
		input.close();
	}

	public static int decimal(int a) {
		int res = 0;
		for (int i = 9; i >= 0; i--) {
			res += (int) Math.pow(2, i) * (a / (int) Math.pow(10, i));
			a %= (int) Math.pow(10, i);
		}
		return res;
	}

	public static boolean isPositiveBinary(int a) {
		if (a < 0) {
			return false;
		}
		for (int i = 9; i >= 0; i--) {
			if (!(a / (int) Math.pow(10, i) == 0 || a / (int) Math.pow(10, i) == 1)) {
				return false;
			}
			a %= (int) Math.pow(10, i);
		}
		return true;
	}
}
