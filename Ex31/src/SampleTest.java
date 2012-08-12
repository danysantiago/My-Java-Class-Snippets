
public class SampleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s1  = new Sample("12345", 100);
		System.out.println(s1);
		// error, counter1 is privatte
		//Sample.counter1++;
		System.out.println(s1);
		System.out.println(s1);
		Sample s2 = new Sample("67890", 121);
		System.out.println(s2);
		s2.modify1(1000);
		System.out.println(s1);
		System.out.println(s2);
	
		

		
	}

}
