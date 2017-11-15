package deitel10_13;

public final class Sphere extends ThreeDimentionalShape {
	private double radius;

	public Sphere(double radius) {
		setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius > 0) {
			this.radius = radius;
		} else {
			System.out.println("Illegal radius of Sphere");
		}
	}

	public double getArea() {
		return 4 * getRadius() * getRadius() * Math.PI;
	}

	@Override
	protected double getVolume() {
		
		return 4 * getRadius() * getRadius() * getRadius() * Math.PI / 3;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s%s%n%s%.2f%n%s%.2f%n%s%.2f%n", super.toString(), "Sphere", "Radius: ", getRadius(), "Area: ",
				getArea(), "Volume: ", getVolume());
	}
}
