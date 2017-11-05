package deitel8_8;

public class DateTset {

	public static void main(String[] args) {
		Date d1 = new Date(2, 20, 2016);
		for (int i = 0; i < 20; i++) {
			d1.nextDay();
			System.out.println(d1);
		}
		d1 = new Date(11,20,2017);
		for (int i = 0; i < 50; i++) {
			d1.nextDay();
			System.out.println(d1);
		}
	}

}
