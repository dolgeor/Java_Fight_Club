import java.util.Scanner;

public class Deitel4_29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;

		System.out.print("Enter side of square: ");
		a = input.nextInt();
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				if (i == 0 || i == a - 1 || j == 0 || j == a - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		input.close();
	}
}
