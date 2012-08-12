
public class MinMax {
	private Object[] values;
	private int currSize;
	private Comparator theComparator;
	
	public MinMax(int maxSize, Comparator theComparator){
		this.values = new Object[maxSize];
		this.currSize = 0;
		this.theComparator = theComparator;
	}

	public int size(){
		return this.currSize;
	}
	
	public void add(Object value){
		if (this.currSize != this.values.length){
			this.values[this.currSize++] = value;
		}
	}
	
	public Object min(){
		Object x = this.values[0];
		for (Object e: values){
			if (e != null && theComparator.LT(e, x)){
				x = e;
			}
		}
		return x;
	}
	public Object max(){
		Object x = this.values[0];
		for (Object e: values){
			if (e != null && theComparator.GT(e, x)){
				x = e;
			}
		}
		return x;
	}

}
