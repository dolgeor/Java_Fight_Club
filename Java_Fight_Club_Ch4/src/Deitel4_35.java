import java.util.Scanner;

public class Deitel4_35 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		int c;

		System.out.print("Enter sides of triangle: ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();

		System.out.println("SIDES CAN MAKE TRIANGLE: " + isTriangle(a, b, c));
		input.close();
	}

	public static boolean isTriangle(int a, int b, int c) {
		return c < a + b && a < b + c && b < a + c ;
	}
}
