
public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String name1 = "Joe";
		String name2 = "Manuel";
		String name3 = new String("Manuel");
		System.out.println("name1: " + name1);
		System.out.printf("name2: %s\n", name2);
		System.out.println("Jose.length(): " + "Jose".length());
		//String name4 = null;
		//System.out.println("name4.length(): " + name4.length());
		
		String number1 = "123";
		String number2 = "834";
		int n1 = Integer.parseInt(number1);
		int n2 = Integer.parseInt(number2);
		// integer addition
		System.out.printf("%s + %s = %d\n", number1, number2, n1+n2);
		// string concatenation
		System.out.printf("%s + %s = %s\n", number1, number2, number1 + number2);
		// string concatenation
		System.out.printf("%s + %s = %s\n", number1, number2, number1 + n2);
		// Substrings
		
		String str = "Tito Kayak";
		System.out.println("str: " + str);
		System.out.println("str.length(): " + str.length());
		System.out.println("str.substring(0, 3): " + str.substring(0,3));
		System.out.println("str.substring(0, 10): " + str.substring(0,10));
		System.out.println("str.substring(0, 9): " + str.substring(0,9));
		System.out.println("str.substring(0, 4): " + str.substring(0,4));
		System.out.println("str.substring(5, 10): " + str.substring(5,10));
		System.out.println("str.substring(1, 1): " + str.substring(1,1));
		// ERROR
		//System.out.println("str.substring(1, 11): " + str.substring(1,11));
		//System.out.println("str.substring(-1, 1): " + str.substring(-1,1));
		System.out.println("str.substring(4, 1): " + str.substring(4,1));

		
		
		
		
		
		
		
		
		
		
		
		

	}

}
