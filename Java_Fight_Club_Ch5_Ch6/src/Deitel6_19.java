import java.util.Scanner;

public class Deitel6_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size;
		char fill;
		System.out.print("Enter size: ");
		size = input.nextInt();
		System.out.print("Enter char: ");
		fill= input.next().charAt(0);
		printSquare(size, fill);
		input.close();
	}
	static void printSquare(int s, char c) {
		for (int i = 0; i < s; i++) {
			for (int j = 0; j <s; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
