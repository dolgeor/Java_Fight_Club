import java.util.Scanner;

public class Deitel4_36 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		int c;

		System.out.print("Enter first katet: ");
		a = input.nextInt();
		System.out.print("Enter first katet: ");
		b = input.nextInt();
		System.out.print("Enter first hypotenuse: ");
		c = input.nextInt();

		System.out.println("IS RIGHT TRIANGLE: " + isRightTriangle(a, b, c));
		input.close();
	}

	public static boolean isRightTriangle(int a, int b, int c) {
		return a * a + b * b == c * c;
	}
}
