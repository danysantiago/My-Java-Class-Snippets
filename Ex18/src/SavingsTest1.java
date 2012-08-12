import java.util.Scanner;


public class SavingsTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the intial amount: ");
		double initAmount = in.nextDouble();
		System.out.println("Enter the yearly savings amount: ");
		double yearlySavings = in.nextDouble();
		System.out.println("Enter your  savings goal: ");
		double goal = in.nextDouble();
		Invest investCalc = new Invest(initAmount, yearlySavings);
		int years = investCalc.yearsToReachSavingsGoal(goal);
		System.out.println("The number of years to reach your goals is: " + years);

	
	}

}
