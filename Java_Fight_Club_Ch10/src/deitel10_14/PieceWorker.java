package deitel10_14;

public class PieceWorker extends Employee {
	private int pieces;
	private double wage;

	public PieceWorker(String firstName, String lastName, String socialSecurityNumber, int pieces, double wage) {
		super(firstName, lastName, socialSecurityNumber);
		setPieces(pieces);
		setWage(wage);
	}

	public int getPieces() {
		return pieces;
	}

	public void setPieces(int pieces) {
		if (pieces >= 0) {
			this.pieces = pieces;
		} else {
			System.out.println("It's impossibe to have negative value of peaces");
		}
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		if (wage >= 0) {
			this.wage = wage;
		} else {
			System.out.println("Wage can't be negative");
		}
	}

	@Override
	public double earnings() {
		return getWage() * getPieces();
	}

	// return String representation of SalariedEmployee object
	@Override
	public String toString() {
		return String.format("salaried employee: %s%n%s: %d%n%s: %,.2f", super.toString(),
				"Number of peaces ", getPieces(),"Wage ", getWage());
	}

}
