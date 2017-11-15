package deitel10_13;

public abstract class Shape {
	public abstract double getArea();
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s%n", "This is a shape");
	}
}
