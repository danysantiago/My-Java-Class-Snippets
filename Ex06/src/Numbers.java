
public class Numbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 2000000000;
		int n2 = 2000000000;
		int n3 = n1 + n2;
		
		System.out.println("n3: " + n3);
		
		byte b1= 100;
		byte b2 = 100;
		byte b3 = (byte) (b1 + b2);
		System.out.println("b3: " + b3);
	
		double m1 = n1;
		n1 = (int) (m1*1.2);
		double sum = 12.23 + 18.2 + 19;
		int totalSum = (int) Math.round(sum);
		
		int n4 = 10;
		int n5 = 10;
		System.out.printf("n4++ = %d, ++n5 = %d\n", n4++, ++n5);

		System.out.printf("n4 = %d, n5 = %d\n", n4, n5);
}

}
