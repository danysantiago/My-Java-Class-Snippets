package edu.uprm.ece.icom4015.sort;

public class SelectionSort<T> extends AbstractSort<T> {

	public SelectionSort(T[] elements, Comparator comparator) {
		super(elements, comparator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public SortIterator<T> sort() {
		int minPos;
		for (int i=0; i < elements.length - 1; ++i){
			minPos = findMinRest(i+1);
			if (this.comparator.compare(elements[minPos], elements[i]) < 0){
				swap(minPos, i);
			}
		}

		return new AbstractSortIterator<T>(0);
	}

	private int findMinRest(int start){
		int minPos = start;
		for (int i = start + 1; i < elements.length; ++i){
			if (this.comparator.compare(elements[i], elements[minPos]) < 0){
				minPos = i;
			}
		}
		return minPos;
	}

}
