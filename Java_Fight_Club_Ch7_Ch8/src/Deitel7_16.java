

public class Deitel7_16 {

	public static void main(String[] args) {
		double res = 0.0;
		Double d = new Double(0);
		if (args.length > 1) {
			for(int i = 1; i < args.length; i++) {
				res += d.parseDouble(args[i]);
			}
		}
		System.out.println("Res = " + res);
	
	}

}
