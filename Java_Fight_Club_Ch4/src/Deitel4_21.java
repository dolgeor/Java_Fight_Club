import java.util.Scanner;

public class Deitel4_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int largest;
		int number;
		System.out.print("Enter a number: ");
		largest = input.nextInt();
		for (int counter = 0; counter < 9; counter++) {
			System.out.print("Enter a number: ");
			number = input.nextInt();
			largest = number > largest ? number : largest;
		}
		System.out.print("Largest number is " + largest);
		input.close();

	}
}
