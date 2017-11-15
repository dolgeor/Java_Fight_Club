
public class Deitel4_28 {
	public static void main(String[] args) {
		int x = 5, y = 7;
		if (y == 8)
			if (x == 5)
			System.out.println("@@@@@");
			else
			System.out.println("#####");
			System.out.println("$$$$$");
			System.out.println("&&&&&");
	}
//	if (y == 8)
//		if (x == 5)
//		System.out.println("@@@@@");
//		else
//		System.out.println("#####");
//		System.out.println("$$$$$");
//		System.out.println("&&&&&");
	
//		a) Assuming that x = 5 and y = 8, the following output is produced:
//		@@@@@
//		$$$$$
//		&&&&&
	
	//true
	
//		b) Assuming that x = 5 and y = 8, the following output is produced:
//		@@@@@
	
	//false
	
//		c) Assuming that x = 5 and y = 8, the following output is produced:
//		@@@@@
	
	//false
	
//		d) Assuming that x = 5 and y = 7, the following output is produced. [Note: The last three
//		output statements after the else are all part of a block.]
//		#####
//		$$$$$
//		&&&&&
	
	//false
}
