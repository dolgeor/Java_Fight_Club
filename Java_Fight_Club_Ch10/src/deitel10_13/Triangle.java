package deitel10_13;

public class Triangle extends TwoDimentionalShape {
	private double a;
	private double b;
	private double c;

	public Triangle(double a, double b, double c) {
		setA(a);
		setB(b);
		setC(c);
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		if (a > 0) {
			this.a = a;
		} else {
			System.out.println("Illegal side of triangle");
		}
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		if (b > 0) {
			this.b = b;
		} else {
			System.out.println("Illegal side of triangle");
		}
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		if (c > 0) {
			this.c = c;
		} else {
			System.out.println("Illegal side of triangle");
		}
	}

	public double getArea() {
		double p = (getA() + getB() + getC()) / 2;
		return Math.sqrt(p * ( p - getA())  * ( p - getB())  * ( p - getC()));
	}

	@Override
	public String toString() {
		return String.format("%s%s%n%s%.2f, %.2f, %.2f%n%s%.2f%n", super.toString(), "Triangle", "Sides: ", getA(),
				getB(), getC(), "Area: ", getArea());
	}

}
