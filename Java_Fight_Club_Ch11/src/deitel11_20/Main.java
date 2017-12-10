package deitel11_20;

public class Main {
	public static void main(String[] args) {
		try {
			someMethod();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	static void someMethod() throws Exception {
		try {
			someMethod2();
		} catch (Exception e) {
			System.out.println(e);
			throw new Exception("someMethod()");
		}

	}

	static void someMethod2() throws Exception {
		throw new Exception("someMethod2()");
	}
}
