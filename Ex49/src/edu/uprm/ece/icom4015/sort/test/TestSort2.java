package edu.uprm.ece.icom4015.sort.test;

import edu.uprm.ece.icom4015.sort.MergeSort;
import edu.uprm.ece.icom4015.sort.SelectionSort;
import edu.uprm.ece.icom4015.sort.Sort;
import edu.uprm.ece.icom4015.sort.SortIterator;
import edu.uprm.ece.icom4015.sort.StringComparator;

public class TestSort2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] elements = {"Joe", "Xi", "Ron", "Apu","Amy","Jil"};
		Sort<String> sorter = new SelectionSort<String>(elements, new StringComparator());
		SortIterator<String> iter = sorter.sort();
		for (String a : iter){
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("Done!");
		

		String[] elements2 = {"Joe", "Xi", "Ron", "Apu","Amy","Jil"};
		Sort<String> sorter2 = new MergeSort<String>(elements2, new StringComparator());
		SortIterator<String> iter2 = sorter2.sort();
		for (String a : iter2){
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("Done!");

	}

}
