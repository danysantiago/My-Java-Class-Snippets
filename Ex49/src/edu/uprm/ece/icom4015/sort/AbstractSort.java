package edu.uprm.ece.icom4015.sort;

import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class AbstractSort<T> implements Sort<T> {
	
	protected T[] elements;
	protected Comparator comparator;
	
	protected AbstractSort(T[] elements, Comparator comparator) {
		super();
		this.elements = elements;
		this.comparator = comparator;
	}
	
	protected void swap(int i, int j){
		T temp;
		temp = elements[i];
		elements[i] = elements[j];
		elements[j] = temp;
	}
	
	protected class AbstractSortIterator<T> implements SortIterator<T> {
		private int nextPos;
		
		protected AbstractSortIterator(int nextPos){
			this.nextPos = nextPos;
		}
		
		@Override
		public Iterator<T> iterator() {
			return this;
		}

		@Override
		public boolean hasNext() {
			return nextPos < elements.length;
		}

		@Override
		public T next() {
			if (hasNext()){
				return (T) elements[nextPos++];
			}
			else {
				throw new NoSuchElementException("No more elements on iterator.");
			}
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException("Operation remove not supported.");
		}
		
	}
}
