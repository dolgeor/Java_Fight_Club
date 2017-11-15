
import java.util.Arrays;
import java.util.Scanner;

public class Deitel4_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		int largest1;
//		int largest2;
//		int number;
//		System.out.print("Enter a number: ");
//		largest1 = input.nextInt();
//		System.out.print("Enter a number: ");
//		largest2 = input.nextInt();
//		for (int counter = 0; counter < 8; counter++) {
//			System.out.print("Enter a number: ");
//			number = input.nextInt();
//
//			if (number > (largest1 < largest2 ? largest1 : largest2)) {
//				if (largest1 < largest2) {
//					largest1 = number ;
//				} else {
//					largest2 = number ;
//				}
//			}
//		}
//		System.out.print("Largest numbers are " + largest1 + " and " + largest2);
		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter a number: ");
			arr[i] = input.nextInt();
		}
		Arrays.sort(arr);
		System.out.print("Largest numbers are " + arr[8] + " and " + arr[9]);
		
		
		input.close();
	}
}
