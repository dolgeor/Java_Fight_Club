package deitel8_4;

public class Rectangle {
	private double length;
	private double width;

	public Rectangle() {
		setLength(1);
		setWidth(1);
	}

	public Rectangle(double lengt, double width) {
		setLength(lengt);
		setWidth(width);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		if (length >= 0 && length <= 20) {
			this.length = length;
		}
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if (width >= 0 && width <= 20) {
			this.width = width;
		}
	}

	public double calculateArea() {
		return getLength() * getWidth();
	}

	public double calculatePerimetr() {
		return 2 * (getLength() + getWidth());
	}

	public void printInfo() {
		System.out.printf("W = %f, L = %f%n" , width, length);
		System.out.printf("Area = %f%n", calculateArea());
		System.out.printf("Perimetr = %f%n", calculatePerimetr());
	}
}
