public class Deitel6_15 {
	public static void main(String[] args) {
		double[] side1 = { 3, 5, 8 };
		double[] side2 = { 4, 12, 15 };
		for (int i = 0; i < side2.length; i++) {
			System.out.printf("%.3f^2 + %.3f^2 = %.3f^2%n", side1[i], side2[i], hypotenuse(side1[i], side2[i]));
		}
	}

	static double hypotenuse(double a, double b) {
		return Math.sqrt(a * a + b * b);
	}

}
