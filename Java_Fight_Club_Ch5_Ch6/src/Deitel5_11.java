

import java.util.Scanner;

public class Deitel5_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b,c,d,e;
		System.out.println("Enter five numbers:");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		d = input.nextInt();
		e = input.nextInt();
		
		System.out.println("Smallest value is " + min(a,min(min(b,c),min(e,d))));
		input.close();
	}

	public static int min(int a, int b) {
		if (b < a) {
			return b;
		}
		return a;
	}
}
