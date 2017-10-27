import java.util.Scanner;

public class Deitel5_16 {

	public static void main(String[] args) {

		int a, b, c, d, e;
		
		a=validInput();
		b=validInput();
		c=validInput();
		d=validInput();
		e=validInput();
		
		printAsterisc(a);
		printAsterisc(b);
		printAsterisc(c);
		printAsterisc(d);
		printAsterisc(e);
	}

	public static int validInput() {
		Scanner input = new Scanner(System.in);///gde zakriti???

		int a;
		do {
			System.out.println("Enter a number in diaposone [1, 30]:");
			a = input.nextInt();
		} while (!(a >= 1 && a <= 30));
		return a;
	}

	public static void printAsterisc(int a) {
		System.out.printf("%2d Stars: ", a);
		for (int i = 0; i < a; i++) {
			System.out.print('*');
		}
		System.out.println();
	}

}
