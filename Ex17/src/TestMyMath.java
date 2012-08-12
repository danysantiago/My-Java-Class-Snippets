import java.util.Scanner;


public class TestMyMath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		long n = in.nextLong();
		System.out.printf("Sum from 1 up to %f is equal to %f\n", n, MyMath.sumN(n));
	}
}