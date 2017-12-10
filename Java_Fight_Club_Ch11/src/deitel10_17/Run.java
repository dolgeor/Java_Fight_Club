package deitel10_17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Run {

	public static void main(String[] args) {
		List<CarbonFootprint> list = new ArrayList<>();	
		
		list.add(new Car());
		list.add(new Bicycle());
		list.add(new Building());
		
		for(CarbonFootprint cf : list) {
			System.out.println(cf);
		}
	}

}
