import java.security.SecureRandom;
import java.util.Scanner;

public class Deitel6_29 {
	enum Coin {
		HEADS, TAILS;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int headsCounter = 0;
		int n;
		System.out.print("Enter number of flips: ");
		n = input.nextInt();
		for (int i = 0; i < n; i++) {
			if (flip() == Coin.HEADS)
				headsCounter++;
		}
		System.out.printf("%s: %d%n%s: %d%n",Coin.HEADS,headsCounter, Coin.TAILS, n - headsCounter);
		input.close();
	}

	static Coin flip() {
		return (new SecureRandom()).nextInt() % 2 == 0 ? Coin.HEADS : Coin.TAILS;
	}

}
