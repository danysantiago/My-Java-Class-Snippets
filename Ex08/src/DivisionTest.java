
public class DivisionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int n1 = 123;
		int n2 = 32;
		
		// division by int, makes the result an int
		// even if you try to assing to a double.
		double result1 = n1 / n2;
		System.out.println("result1: " + result1);
		// even if you cast the result, it will still 
		// be an int. Casting is too late.
		double result2 = (double) (n1 / n2);
		System.out.println("result2: " + result2);
		double result3 =  n1 / (double) n2  ;
		System.out.println("result3: " + result3);


	}

}
