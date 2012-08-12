package edu.uprm.ece.icom4015.sort;

public class StringComparator implements Comparator {

	@Override
	public int compare(Object value1, Object value2) {
		if (!(value1 instanceof String) || !(value2 instanceof String)){
			throw new IllegalArgumentException("Arguments for String Comparator must be String");
		}
		String temp1 = (String) value1;
		String temp2 = (String) value2;
		return temp1.compareTo(temp2);

	}

}
