package deitel10_13;

public abstract class TwoDimentionalShape extends Shape {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s%s%n", super.toString(),
				"This shape is two dimentional");
	}
}
