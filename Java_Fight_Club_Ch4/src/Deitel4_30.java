import java.util.Scanner;

public class Deitel4_30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;

		System.out.print("Enter a positive five-digit integer: ");
		a = input.nextInt();
		if (a / 10000 > 0 && a / 10000 <= 9 && a > 0) {
			System.out.println("NUMBER IS PALINDROME: " + isPalindrome(a));
		} else {
			System.out.println("It's not a positive five-digit integer");
		}
		input.close();
	}

	public static boolean isPalindrome(int a) {
		if (a / 10000 - a % 10 != 0) {
			System.out.println((a / 10000 - a % 10));
			return false;
		}
		if ((a % 10000) / 1000 - (a % 100) / 10 != 0) {
			System.out.println((a / 1000) % 10 - (a / 100) % 10);
			return false;
		}
		return true;
	}
}
