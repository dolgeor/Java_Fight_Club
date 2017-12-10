package deitel11_16;

public class Main {
	public static void main(String[] args) {
		try {
			throw new ExceptionB();
		} catch (ExceptionA a) {
			System.out.println(a);
		}
		
		try {
			throw new ExceptionC();
		} catch (ExceptionA a) {
			System.out.println(a);
		}
	}
}
