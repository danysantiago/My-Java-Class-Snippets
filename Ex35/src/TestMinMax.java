
public class TestMinMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinMax collection = new MinMax(5);
		
		collection.add(new SortableInteger(4));
		collection.add(new SortableInteger(-2));
		collection.add(new SortableInteger(100));
		collection.add(new SortableInteger(1500));
		System.out.println("Min: " + collection.min());
		System.out.println("Max: " + collection.max());
		
		collection = null;
		collection = new MinMax(6);
		collection.add(new SortableString("Jil"));
		collection.add(new SortableString("Apu"));
		collection.add(new SortableString("Yi"));
		collection.add(new SortableString("Al"));
		collection.add(new SortableString("Mel"));
		System.out.println("Min: " + collection.min());
		System.out.println("Max: " + collection.max());
		
	
		
	}

}
