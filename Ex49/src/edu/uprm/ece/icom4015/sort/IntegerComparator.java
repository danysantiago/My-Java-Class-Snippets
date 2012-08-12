package edu.uprm.ece.icom4015.sort;

public class IntegerComparator implements Comparator {

	public IntegerComparator(){
		
	}
	@Override
	public int compare(Object value1, Object value2) {
		if (!(value1 instanceof Integer) || !(value2 instanceof Integer)){
			throw new IllegalArgumentException("Arguments for Integer Comparator must be Integer");
		}
		Integer temp1 = (Integer) value1;
		Integer temp2 = (Integer) value2;
		return temp1.compareTo(temp2);

	}

}
