package edu.uprm.ece.icom4015.sort.test;

import edu.uprm.ece.icom4015.sort.IntegerComparator;
import edu.uprm.ece.icom4015.sort.MergeSort;
import edu.uprm.ece.icom4015.sort.SelectionSort;
import edu.uprm.ece.icom4015.sort.Sort;
import edu.uprm.ece.icom4015.sort.SortIterator;

public class TestSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] elements = {12, 8, -1, 15, 0, 2};
		Sort<Integer> sorter = new SelectionSort<Integer>(elements, new IntegerComparator());
		SortIterator<Integer> iter = sorter.sort();
		for (Integer a : iter){
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("Done!");
		
	
		Integer[] elements2 = {12, 8, -1, 15, 0, 2};
		Sort<Integer> sorter2 = new MergeSort<Integer>(elements2, new IntegerComparator());
		SortIterator<Integer> iter2 = sorter2.sort();
		for (Integer a : iter2){
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("Done!");

		
	}

}
