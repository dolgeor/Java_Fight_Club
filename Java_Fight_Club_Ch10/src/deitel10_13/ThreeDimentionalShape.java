package deitel10_13;

public abstract class ThreeDimentionalShape extends Shape {
	protected abstract double getVolume();
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s%s%n", super.toString(),
				"This shape is three dimentional");
	}

}
