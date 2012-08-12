package edu.uprm.ece.icom4015.sort;

public class SelectionSortString {
	private String[] elements;
	
	public SelectionSortString(String[] elements){
		if (elements == null){
			throw new IllegalArgumentException("Cannot pass elements array as null.");
		}
		this.elements = elements;
	}
	
	public String get(int index){
		if (index <0 || index >= elements.length){
			throw new IllegalArgumentException("Array index is out of bounds.");
		}
		return this.elements[index];
	}
	
	public void sort(){
		int minPos;
		for (int i=0; i < elements.length - 1; ++i){
			minPos = findMinRest(i+1);
			if (elements[minPos].compareTo(elements[i]) < 0){
				swap(minPos, i);
			}
		}
	}
	
	private void swap(int i, int j){
		String temp = elements[i];
		elements[i] = elements[j];
		elements[j] = temp;
	}

	private int findMinRest(int start){
		int minPos = start;
		for (int i = start + 1; i < elements.length; ++i){
			if (elements[i].compareTo(elements[minPos]) < 0){
				minPos = i;
			}
		}
		return minPos;
	}
	
	public int size(){
		return elements.length;
	}

}
