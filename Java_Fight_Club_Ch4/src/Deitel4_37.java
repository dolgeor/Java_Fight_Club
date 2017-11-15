import java.util.Scanner;

public class Deitel4_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		///// a/////
		int fact;
		System.out.print("Enter the number to find it factorial: ");
		fact = input.nextInt();
		System.out.printf("Factorial(%d) = %d%n", fact, factorial(fact));

		///// b/////
		int exp;
		System.out.print("Enter the numberof iterations to find exponent: ");
		exp = input.nextInt();
		System.out.printf("Exp = %f%n", exponent(exp));

		///// c/////
		double x;
		System.out.print("Enter the numberof iterations to find exponent: ");
		exp = input.nextInt();
		System.out.print("Enter x: ");
		x = input.nextDouble();
		System.out.printf("Exp(%f) = %f%n", x, exponentX(exp, x));

		input.close();
	}

	public static double exponentX(int n, double x) {
		if (n >= 0 && n <= 12) {
			if (n == 0) {
				return 1.0;
			}
			return Math.pow(x, n) / factorial(n) + exponentX(n - 1, x);
		}
		return 0;
	}

	public static double exponent(int n) {
		if (n >= 0 && n <= 12) {
			if (n == 0) {
				return 1.0;
			}
			return 1.0 / factorial(n) + exponent(n - 1);
		}
		return 0;
	}

	public static int factorial(int n) {
		if (n >= 0 && n <= 12) {
			if (n == 0) {
				return 1;
			}
			return n * factorial(n - 1);
		}
		return 0;
	}
}
