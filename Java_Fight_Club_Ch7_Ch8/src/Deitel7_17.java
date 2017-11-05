import java.security.SecureRandom;

public class Deitel7_17 {

	public static void main(String[] args) {
		SecureRandom rand = new SecureRandom();
		int dice[][]=new int[6][6];
		for (int i = 0; i < 36000000; i++) {
			dice[rand.nextInt(6)][rand.nextInt(6)]++;
		}
		System.out.printf("%12c",' ');
		for (int i = 1; i <= dice.length; i++) {
			System.out.printf("%12d", i);
		}
		for (int i = 0; i < dice.length; i++) {
			System.out.println();
			System.out.printf("%12d", i + 1);
			for (int j = 0; j < dice[i].length; j++) {
				System.out.printf("%12d", dice[i][j]);
			}
			
		}
	}

}
