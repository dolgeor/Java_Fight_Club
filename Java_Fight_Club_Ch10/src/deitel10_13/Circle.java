package deitel10_13;

public final class Circle extends TwoDimentionalShape {
	private double radius;
	
	public Circle(double radius) {
		setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius > 0) {
			this.radius = radius;
		} else {
			System.out.println("Illegal radius of circle");
		}
	}
	
	public double getArea() {
		return getRadius() * getRadius() * Math.PI;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s%s%n%s%.2f%n%s%.2f%n",super.toString(),
				"Circle","Radius: ", getRadius(),"Area: ",getArea());
	}
	
}
