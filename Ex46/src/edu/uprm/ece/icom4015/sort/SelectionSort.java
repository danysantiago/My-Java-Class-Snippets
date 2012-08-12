package edu.uprm.ece.icom4015.sort;

public class SelectionSort {
	private int[] elements;
	
	public SelectionSort(int[] elements){
		if (elements == null){
			throw new IllegalArgumentException("Cannot pass elements array as null.");
		}
		this.elements = elements;
	}
	
	public int get(int index){
		if (index <0 || index >= elements.length){
			throw new IllegalArgumentException("Array index is out of bounds.");
		}
		return this.elements[index];
	}
	
	public void sort(){
		int minPos;
		for (int i=0; i < elements.length - 1; ++i){
			minPos = findMinRest(i+1);
			if (elements[minPos] < elements[i]){
				swap(minPos, i);
			}
		}
	}
	
	private void swap(int i, int j){
		int temp = elements[i];
		elements[i] = elements[j];
		elements[j] = temp;
	}

	private int findMinRest(int start){
		int minPos = start;
		for (int i = start + 1; i < elements.length; ++i){
			if (elements[i] < elements[minPos]){
				minPos = i;
			}
		}
		return minPos;
	}
	
	public int size(){
		return elements.length;
	}
}
