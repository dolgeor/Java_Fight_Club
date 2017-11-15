
public class Deitel4_27 {
	public static void main(String[] args) {
		
		int x, y;
		
		///a/////
		x = 9;
		y = 11;
		if (x < 10)
			if (y > 10)
			System.out.println("*****");
			else
			System.out.println("#####");
			System.out.println("$$$$$");
	///		*****
	///		$$$$$
			
			///a/////
			x = 11;
			y = 9;
			if (x < 10)
				if (y > 10)
				System.out.println("*****");
				else
				System.out.println("#####");
				System.out.println("$$$$$");
	
		///		$$$$$
			System.out.println();	
			/////b/////
			x = 9;
			y = 11;
			 if (x < 10)
			{
			if (y > 10)
			System.out.println("*****");
			}
			else
			{
			System.out.println("#####");
			System.out.println("$$$$$");
			}
			 
			///		*****
			
			 
			/////b/////
				x = 11;
				y = 9;
				 if (x < 10)
				{
				if (y > 10)
				System.out.println("*****");
				}
				else
				{
				System.out.println("#####");
				System.out.println("$$$$$");
				}
				///		#####
					///		$$$$$
	}
}
