
public class CarNamesTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarNames C = new CarNames(10);
		C.add("Ford");
		C.add("BMW");
		C.add("Bentley");
		C.add("Nissan");
		C.add("Toyota");
		C.add("Audi");
		C.add("BMW");
		// get the car at position 0
		System.out.println("car at position 0: " + C.get(0));
		System.out.println("Location of BMW: " + C.find("BMW"));
		System.out.println("Location of Ferrari: " + C.find("Ferrari"));
		System.out.println("Copies of Ferrari: " + C.count("Ferrari"));
		System.out.println("Copies of BMW: " + C.count("BMW"));
		System.out.println("Copies of Audi: " + C.count("Audi"));
		System.out.println("Min element: " + C.min());
		System.out.println("Max element: " + C.max());
		System.out.println("Print all: ");
		C.print(System.out);

		
	}

}
