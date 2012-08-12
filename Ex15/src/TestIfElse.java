import java.util.Scanner;


public class TestIfElse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of years in college: ");
		int numYears = in.nextInt();
		if (numYears < 1){
			System.out.println("Are you in high school?");
		}
		else if (numYears == 1){
			System.out.println("You are a freshman.");
		}
		else if (numYears == 2){
			System.out.println("You are a sophomore.");
		}
		else if (numYears == 3){
			System.out.println("You are a junior.");
		}
		else if (numYears == 4){
			System.out.println("You are a senior.");
		}
		else if (numYears == 5){
			System.out.println("You are a senior at UPRM.");
		}
		else {
			System.out.println("You need to graduate!");
		}

	}

}
