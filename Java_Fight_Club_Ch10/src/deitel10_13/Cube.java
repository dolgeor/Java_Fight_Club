package deitel10_13;

public final class Cube extends ThreeDimentionalShape {
	private double side;

	public Cube(double side) {
		setSide(side);
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		if (side > 0) {
			this.side = side;
		} else {
			System.out.println("Illegal side of Cube");
		}
	}

	public double getArea() {
		return getSide() * getSide() * 6;
	}
	@Override
	protected double getVolume() {
		// TODO Auto-generated method stub
		return getSide() * getSide() *getSide();
	}
	
	public String toString() {
		return String.format("%s%s%n%s%.2f%n%s%.2f%n%s%.2f%n",super.toString(),
				"Cube","Side: ", getSide(),"Area: ",getArea(), "Volume: ", getVolume());
	}

}
