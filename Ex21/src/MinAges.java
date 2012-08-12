import java.util.Scanner;


public class MinAges {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of ages: ");
		int numAges = in.nextInt();
		if (numAges < 1){
			System.out.println("Number of ages must be at least 1.");
			System.exit(1);
		}
		
		int[] theAges = new int[numAges];
		
		// loop ask for the ages
		for (int i=0; i < numAges; ++i){
			System.out.printf("Enter age number %d: ", i);
			theAges[i] = in.nextInt();
		}
		
		// loop
		int minAge = theAges[0];
		for (int i=1; i <= theAges.length; ++i){
			if (theAges[i] < minAge){
				minAge = theAges[i];
			}
		}
		System.out.println("The minimum ages is: " + minAge);
	}

}
