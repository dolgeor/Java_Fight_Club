

public class Deitel7_14 {
	public static void main(String[] args) {
		int res = 0;
		if (args.length > 1) {
			res = 1;
			for(int i = 1; i < args.length; i++) {
				res *= new Integer(args[i]);
			}
		}
		System.out.println("Res = " + res);
	}
}
