package edu.uprm.ece.icom4015.sort.test;

import java.util.Random;

import edu.uprm.ece.icom4015.sort.SelectionSort;

public class SelectionSortTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random rand = new Random();
		int size = 60000;
		int[] elements = new int[size];
		for(int i = 0; i < size; i++){
			elements[i] = rand.nextInt(10000);
		}
		
		SelectionSort sorter = new SelectionSort(elements);
		long time = System.currentTimeMillis();
		sorter.sort();
		System.out.println("\nDone! Took me: " + (System.currentTimeMillis() - time) + " milliseconds");
	}

}
