
public class TestMinMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MinMax collection = new MinMax(10);
		
		collection.add(4);
		collection.add(-2);
		collection.add(100);
		collection.add(1500);
		System.out.println("Min: " + collection.min());
		System.out.println("Max: " + collection.max());

	
		MinMaxString collection2 = new MinMaxString(10);
		
		collection2.add("Joe");
		collection2.add("Yu");
		collection2.add("Mel");
		collection2.add("Apu");
		System.out.println("Min: " + collection2.min());
		System.out.println("Max: " + collection2.max());
}

}
