package deitel10_13;

public final class Square extends TwoDimentionalShape {
	private double side;

	public Square(double side) {
		setSide(side);
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		if (side > 0) {
			this.side = side;
		} else {
			System.out.println("Illegal side of square");
		}
	}

	public double getArea() {
		return getSide() * getSide();
	}

	@Override
	public String toString() {
		return String.format("%s%s%n%s%.2f%n%s%.2f%n",super.toString(),
				"Square","Side: ", getSide(),"Area: ",getArea());
	}

}
