
public class Polymorphism {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sortable x = new SortableInteger(10);
		Sortable y = new SortableInteger(100);
		System.out.println("x > y: " + x.GT(y));
		System.out.println("x < y: " + x.LT(y));
		// Compile error: cannot acces getValue
		// because it is a method of class
		// SortableInteger. Interface Sortable
		// does not provide it.
		//int value = x.getValue();
		
		// Solution: Casting
		int value = ((SortableInteger) x).getValue();
		System.out.println("value: " + value);
		x = new SortableString("Apu");
		y = new SortableString("Joe");
		System.out.println("x > y: " + x.GT(y));
		System.out.println("x < y: " + x.LT(y));
	
		
		// Error because x is now reference to an
		// object of type SortableString
		//value = ((SortableInteger) x).getValue();


	}

}
