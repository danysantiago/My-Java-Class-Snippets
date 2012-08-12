
public class IntegerComparator implements Comparator {

	public IntegerComparator(){
		
	}
	
	@Override
	public boolean GT(Object obj1, Object obj2) {
		Integer value1 = (Integer) obj1;
		Integer value2 = (Integer) obj2;
		return value1.compareTo(value2) > 0;
	}

	@Override
	public boolean LT(Object obj1, Object obj2) {
		Integer value1 = (Integer) obj1;
		Integer value2 = (Integer) obj2;
		return value1.compareTo(value2) < 0;
	}

}
