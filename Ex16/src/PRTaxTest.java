import java.util.Scanner;


public class PRTaxTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the adjusted salary: ");
		double adjustedSalary = in.nextDouble();
		in.nextLine();
		System.out.println("Are you married filling separate? Y/N: ");
		String marriedSeparated = in.nextLine();
		boolean marriedFillSeparate = false;
		if (marriedSeparated.equalsIgnoreCase("Y")){
			marriedFillSeparate = true;
		}
		PRTax taxCalculator = new PRTax(marriedFillSeparate, adjustedSalary);
		double tax = taxCalculator.computeTax();
		System.out.println("You taxes are: $ " + tax);
	}

}
