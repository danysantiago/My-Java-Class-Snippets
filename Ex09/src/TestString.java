
public class TestString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String number1 = "123";
		String number2 = "345";
		int n1 = Integer.parseInt(number1);
		int n2 = Integer.parseInt(number2);
		System.out.printf("%s + %s = %d\n", number1, number2, n1 + n2);
		System.out.printf("%s + %s = %s\n", number1, number2, number1 + number2);
		System.out.printf("%s + %s = %s\n", number1, number2, number1 + n2);
		
		String number3 = null;
		System.out.println("number3.length(): " + number3.length());

	}

}
