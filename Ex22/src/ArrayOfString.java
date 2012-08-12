
public class ArrayOfString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = new String[4];
		//causes a crash
		//System.out.println("Length of element 0: " + names[0].length());
		names[1] = "Amy";
		names[0] = new String("Jil");
		names[2] = "Tito " + "Kayak";
		names[3] = names[0];
		
		// loop to print them
		for (int i=0; i < names.length; ++i){
			System.out.printf("Element %d is equal to %s with lenth %d\n", i, names[i],
					names[i].length());
		}
	}

}
