package edu.uprm.ece.icom4015.sort;

public interface Comparator {
	
	// return 0, value1 equal value2
	// return > 0, value1 > value2;
	// return < 0, value1 < value2
	public int compare(Object value1, Object value2);

}
