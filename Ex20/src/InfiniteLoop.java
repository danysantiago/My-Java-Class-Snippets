import java.util.Scanner;


public class InfiniteLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		long n = in.nextLong();
		long sum = MyMath.sumNSqr(n);
		System.out.printf("The sum of the squares from 1 to %d is %d\n", n, sum);
	}

}
