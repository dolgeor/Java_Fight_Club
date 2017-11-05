

import java.util.Arrays;
import java.util.Scanner;

public class Deitel7_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int array[] = new int[5];
		int i = 0;
		while (i != 5) {
			int tmp = 0;
			do {
				System.out.print("Set is :");
				for(int j = 0;j < i; j++) {
					System.out.printf("%4d", array[j]);
					if(tmp == array[j]) {
						tmp = 1;
					}
				}
				System.out.println();
				System.out.print("Enter number in following diaposon [10,100]: ");
				tmp = input.nextInt();
				
				for(int j = 0;j < i; j++) {
					if(tmp == array[j]) {
						tmp = 1;
					}
				}
				
			} while (!(tmp >= 10 && tmp <= 100));
			array[i] = tmp;
			
			i++;
		}
		System.out.print("Final set is: ");
		for (int x : array) {
			System.out.printf("%4d", x);
		}
		input.close();
	}

}
