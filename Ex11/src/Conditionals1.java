import java.util.Scanner;


public class Conditionals1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a positive integer: ");
		int value = in.nextInt();
		if (value < 0){
			System.out.printf("Follow instructions. The number %d is not positive.\n", value);
			System.exit(1);
		}
		System.out.println("Thanks. The value read was: " + value);
		
	}

}
