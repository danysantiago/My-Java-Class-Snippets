
public class TestMinMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinMax collection = new MinMax(5, new IntegerComparator());
		
		collection.add(4);
		collection.add(-2);
		collection.add(100);
		collection.add(new Integer(1500));
		System.out.println("Min: " + collection.min());
		System.out.println("Max: " + collection.max());
		
		collection = null;
		collection = new MinMax(6, new StringComparator());
		collection.add(new String("Jil"));
		collection.add("Apu");
		collection.add(new String("Yi"));
		collection.add(new String("Al"));
		collection.add(new String("Mel"));
		System.out.println("Min: " + collection.min());
		System.out.println("Max: " + collection.max());
		
	
		
	}

}
