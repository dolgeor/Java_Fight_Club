package deitel10_17;

public class Building  implements CarbonFootprint {
	
	
	int area = 50;
	int distanceFromCenter = 20;
	int floor = 5;
	
	@Override
	public double calcPrice() {
		return 100 * area * distanceFromCenter * floor;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Building: " + calcPrice() + " $";
	}
}
