
public class StringComparator implements Comparator {

	@Override
	public boolean GT(Object obj1, Object obj2) {
		String value1 = (String) obj1;
		String value2 = (String) obj2;
		return value1.compareTo(value2) > 0;

	}

	@Override
	public boolean LT(Object obj1, Object obj2) {
		String value1 = (String) obj1;
		String value2 = (String) obj2;
		return value1.compareTo(value2) < 0;
	}

}
