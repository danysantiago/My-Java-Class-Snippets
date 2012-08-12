import java.util.Scanner;


public class TestMyMath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a floating point number: ");
		double n = in.nextDouble();
		double absN = MyMath.abs(n);
		System.out.printf("The absolute value of %f is %f\n", n, absN);
		
	}

}
