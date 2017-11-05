

public class Deitel7_15 {
	public static void main(String[] args) {
		int[] array;
		if (args.length > 1) {
			array = new int[new Integer(args[1])];
		} else {
			array = new int[10]; // create the array object
		}
		for (int counter = 0; counter < array.length; counter++)
			System.out.printf("%5d%8d%n", counter, array[counter]);
	}
}
