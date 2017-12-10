package deitel10_17;

public class Bicycle  implements CarbonFootprint {
	
	
	int weight = 3000;
	
	
	@Override
	public double calcPrice() {
		return weight * 1.5;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Bicycle: " + calcPrice() + " $";
	}
}
