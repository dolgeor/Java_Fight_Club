import java.util.Scanner;

public class Deitel6_20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double r;
		System.out.print("Enter radius: ");
		r = input.nextDouble();
		System.out.print("Area of circle is  " + r*r*Math.PI);
		input.close();
	}

}
