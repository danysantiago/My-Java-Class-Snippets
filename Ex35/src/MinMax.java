
public class MinMax {
	private Sortable[] values;
	private int currSize;
	
	public MinMax(int maxSize){
		this.values = new Sortable[maxSize];
		this.currSize = 0;
	}

	public int size(){
		return this.currSize;
	}
	
	public void add(Sortable value){
		if (this.currSize != this.values.length){
			this.values[this.currSize++] = value;
		}
	}
	
	public Sortable min(){
		Sortable x = this.values[0];
		for (Sortable e: values){
			if (e != null && e.LT(x)){
				x = e;
			}
		}
		return x;
	}
	public Sortable max(){
		Sortable x = this.values[0];
		for (Sortable e: values){
			if (e != null && e.GT(x)){
				x = e;
			}
		}
		return x;
	}

}
