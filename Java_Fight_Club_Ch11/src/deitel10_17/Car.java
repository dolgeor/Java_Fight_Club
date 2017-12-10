package deitel10_17;

public class Car implements CarbonFootprint {
	
	
	int year = 2007;
	double volume = 2.0;
	
	@Override
	public double calcPrice() {
		return 20 * volume *year;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Car: " + calcPrice() + " $";
	}
}
