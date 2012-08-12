
import java.util.Scanner;


public class TestSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of years in college: ");
		int numYears = in.nextInt();
		if (numYears < 1){
			System.out.println("Are you in high school?");
			System.exit(0);
		}
		String msg = null;
		switch(numYears){
		case 1:
			msg = "You are a freshman.";
			break;
		case 2:
			msg = "You are a sophomore.";
			break;
		case 3:
			msg = "You are a junior.";
			break;
		case 4:
		case 5:
			msg = "You are a senior.";
			break;
		default:
				msg = "You need to graduate!";	
		}
		System.out.println(msg);
		System.exit(0);
	}

}
