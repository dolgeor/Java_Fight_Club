package deitel11_17;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		Exception[] ex = new Exception[4];
		ex[0] = new ExceptionA();
		ex[1] = new ExceptionB();
		ex[2] = new NullPointerException();
		ex[3] = new IOException();

		for (Exception e : ex) {

			try {
				throw e;
			} catch (Exception exception) {
				System.out.println(exception);
			}
		}
	}
}
