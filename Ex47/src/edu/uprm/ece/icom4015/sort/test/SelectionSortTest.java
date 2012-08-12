package edu.uprm.ece.icom4015.sort.test;

import edu.uprm.ece.icom4015.sort.SelectionSortString;

public class SelectionSortTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] elements = {"Joe", new String("Bob"), "Amy", "Xi", "Lu", "Apu", "Ted", "Ron"};
		// equivalent to 
		/*
		 * int[] elements = new int[5];
		 * elements[0] = 8;
		 * elements[1] = 10;
		 * elements[2] = 0;
		 * elements[3] = 9;
		 * elements[4] = 12;
		 */
		
		SelectionSortString sorter = new SelectionSortString(elements);
		sorter.sort();
		for (int i=0; i < sorter.size() ; ++i){
			System.out.print(sorter.get(i) + " ");
		}
		System.out.println("\nDone!");
	}

}
