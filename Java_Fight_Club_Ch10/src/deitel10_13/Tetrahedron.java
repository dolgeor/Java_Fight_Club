package deitel10_13;

public final class Tetrahedron extends ThreeDimentionalShape {
	private double a;

	public Tetrahedron(double a) {
		setA(a);
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		if (a > 0) {
			this.a = a;
		} else {
			System.out.println("Illegal  side of Tetrahedron");
		}
	}

	

	public double getArea() {
		return getA() * getA() *  Math.sqrt(3);
	}

	@Override
	protected double getVolume() {
		return Math.sqrt(3) * getA()* getA()* getA() / 12;
	}

	@Override
	public String toString() {
		return String.format("%s%s%n%s%.2f%n%s%.2f%n%s%.2f%n", super.toString(),
				"Tetrahedron",	"Side: ", getA(), "Area: ", getArea(), "Volume: ",
				getVolume());
	}


}
