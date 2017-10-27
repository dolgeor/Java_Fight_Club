
import java.util.Scanner;

public class Deitel6_26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = 0;
		String str;
		System.out.print("Enter the number: ");
		number = input.nextInt();
		str = new StringBuilder( new Integer(number).toString()).reverse().toString();
		System.out.println("Reverse number(str) is " + str);
		System.out.println("Reverse number(int) is " + reverseInt(number));
		input.close();
	}
	public static int reverseInt(int n) {
		int digits = 1;
		int res = n;
		while((n = n / 10) > 0) {
			digits++;
		}
		n = res;
		res = 0;
		for(int i = 0; i < digits;i++) {
			res *= 10;
			res += n % 10;
			n /= 10;
		}
		return res;
	}

}
