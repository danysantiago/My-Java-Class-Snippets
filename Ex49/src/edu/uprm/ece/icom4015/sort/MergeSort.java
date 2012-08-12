package edu.uprm.ece.icom4015.sort;


public class MergeSort<T> extends AbstractSort<T> {

	public MergeSort(T[] elements, Comparator comparator) {
		super(elements, comparator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public SortIterator<T> sort() {
		if (elements.length <= 1){
			return new AbstractSortIterator<T>(0);
		}
		else {
			T[] firstHalf = splitArray(0, elements.length/2);
			T[] secondHalf = splitArray(elements.length/2, elements.length - firstHalf.length);
			MergeSort<T> sorter1 = new MergeSort<T>(firstHalf, this.comparator);
			MergeSort<T> sorter2 = new MergeSort<T>(secondHalf, this.comparator);
			sorter1.sort();
			sorter2.sort();
			merge(firstHalf, secondHalf);
			return new AbstractSortIterator<T>(0);
		}
	}

	private void merge(T[] firstHalf, T[] secondHalf) {
		int iFirst = 0; // index on firstHalf array
		int iSecond = 0; // index on secondHalf array
		int j = 0; // index on elements (where the sorted array lands)
		while (iFirst < firstHalf.length && iSecond < secondHalf.length){
			if (this.comparator.compare(firstHalf[iFirst], secondHalf[iSecond]) < 0){
				elements[j++] = firstHalf[iFirst++];
			}
			else {
				elements[j++] = secondHalf[iSecond++];
			}
		}
		// copy any leftover elements from firstHalf
		while (iFirst < firstHalf.length){
			elements[j++] = firstHalf[iFirst++];
		}
		
		// copy any leftover elements from secondHalf
		while (iSecond < secondHalf.length){
			elements[j++] = secondHalf[iSecond++];
		}
	
	}

	private T[] splitArray(int start, int length) {
		T[] result = (T[]) new Object[length];
		for (int i=0, j = start; i < length; ++i, ++j){
			result[i] = elements[j];
		}
		return result;
	}
	
	

}
