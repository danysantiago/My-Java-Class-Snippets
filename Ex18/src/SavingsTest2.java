import java.util.Scanner;


public class SavingsTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String answer = null;

		do {
			System.out.println("Enter the intial amount: ");
			double initAmount = in.nextDouble();
			System.out.println("Enter the yearly savings amount: ");
			double yearlySavings = in.nextDouble();
			System.out.println("Enter your  savings goal: ");
			double goal = in.nextDouble();
			// clear the input buffer
			in.nextLine();
			Invest investCalc = new Invest(initAmount, yearlySavings);
			int years = investCalc.yearsToReachSavingsGoal(goal);
			System.out.println("The number of years to reach your goals is: " + years);
			// ask if the he/she wants another trial
			System.out.println("Do you want to make another calculation? (Y/N): ");
			answer = in.nextLine();
		}
		while(answer.equalsIgnoreCase("Y"));
		System.out.println("Good bye!");
	}

}
