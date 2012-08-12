
public class StringCompare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name1 = "Manuel";
		String name2 = new String("Manuel");
		String name3 = name1;
		
		if (name1 == name2){
			System.out.println("name1 == name2");
		}
		else {
			System.out.println("name1 != name2");
		}
		
		if (name2 == name3){
			System.out.println("name2 == name3");
		}
		else {
			System.out.println("name2 != name3");
		}
		
		if (name1 == name3){
			System.out.println("name1 == name3");
		}
		else {
			System.out.println("name1 != name3");
		}

	}

}
