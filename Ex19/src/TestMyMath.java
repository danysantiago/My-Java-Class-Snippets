import java.util.Scanner;


public class TestMyMath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		long n = in.nextLong();
		System.out.printf("Sum from 1 up to %d is equal to %d\n", n, MyMath.sumN(n));
		System.out.printf("Sum for all evens number from 1 up to %d is equal to %d\n", n,
				MyMath.evenSumN(n));
		System.out.printf("The factorial of %d is equal to %d\n", n,
				MyMath.factorial(n));
	
	
	}
}