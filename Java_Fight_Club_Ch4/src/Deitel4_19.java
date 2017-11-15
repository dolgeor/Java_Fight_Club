import java.util.Scanner;

public class Deitel4_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double weakSales[]= { 239.99,129.75,99.95,350.89};
		int	numberOfItems[] = new int[4];
		int codeOfItem;
		double earnings = 0;
		
		do {
			System.out.print("Enter code of item:");
			codeOfItem = input.nextInt();
			switch (codeOfItem) {
			case 1:
				System.out.print("Enter the number of items :");
				numberOfItems[0] = input.nextInt();
				if(numberOfItems[0] < 0) numberOfItems[0] = 0;
				break;
			case 2:
				System.out.print("Enter the number of items :");
				numberOfItems[1] = input.nextInt();
				if(numberOfItems[1] < 0) numberOfItems[1] = 0;
				break;
			case 3:
				System.out.print("Enter the number of items :");
				numberOfItems[2] = input.nextInt();
				if(numberOfItems[2] < 0) numberOfItems[2] = 0;
				break;
			case 4:
				System.out.print("Enter the number of items :");
				numberOfItems[3] = input.nextInt();
				if(numberOfItems[3] < 0) numberOfItems[3] = 0;
				break;
			default:
				break;
			}
			System.out.println("Press -1 to stop input: ");
			if (input.nextInt() == -1) 	break;
		} while (true);
		
		for(int i = 0; i < numberOfItems.length; i++) {
			earnings += numberOfItems[i] * weakSales[i];
		}
		earnings *= 0.9 + 200;
		System.out.printf("%5s%10s%n","Nr","Price");
		System.out.printf("%5s%10s%n",numberOfItems[0],weakSales[0]);
		System.out.printf("%5s%10s%n",numberOfItems[1],weakSales[1]);
		System.out.printf("%5s%10s%n",numberOfItems[2],weakSales[2]);
		System.out.printf("%5s%10s%n",numberOfItems[3],weakSales[3]);
		System.out.println("---------------");
		System.out.printf("%s%15.2f%n","Earning",earnings);
		input.close();
	}

}
