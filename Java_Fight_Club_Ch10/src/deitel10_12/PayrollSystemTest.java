package deitel10_12;

import java.time.LocalDate;

// Fig. 10.9: PayrollSystemTest.java
// Employee hierarchy test program.

public class PayrollSystemTest {
	public static void main(String[] args) {

		SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", new Date(10, 15, 1970),
				800.00);
		HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", new Date(11, 17, 1996),
				16.75, 40);
		CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333",
				new Date(6, 2, 1985), 10000, .06);
		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis",
				"444-44-4444", new Date(7, 4, 1996), 5000, .04, 300);

		// create four-element Employee array
		Employee[] employees = new Employee[4];

		// initialize array with Employees
		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = commissionEmployee;
		employees[3] = basePlusCommissionEmployee;

		// generically process each element in array employees
		for (Employee currentEmployee : employees) {
			System.out.println(currentEmployee); // invokes toString

			// determine whether element is a BasePlusCommissionEmployee
			if (currentEmployee.getBirthDate().getMonth() == LocalDate.now().getMonthValue()) {
				System.out.println("Happy Birth Day!!!");
				System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings() + 100);
			} else {
				System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
			}
		}

	}
} // end class PayrollSystemTest

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and * Pearson Education,
 * Inc. All Rights Reserved. * * DISCLAIMER: The authors and publisher of this
 * book have used their * best efforts in preparing the book. These efforts
 * include the * development, research, and testing of the theories and programs
 * * to determine their effectiveness. The authors and publisher make * no
 * warranty of any kind, expressed or implied, with regard to these * programs
 * or to the documentation contained in these books. The authors * and publisher
 * shall not be liable in any event for incidental or * consequential damages in
 * connection with, or arising out of, the * furnishing, performance, or use of
 * these programs. *
 *************************************************************************/
