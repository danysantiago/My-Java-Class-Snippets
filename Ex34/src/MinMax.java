
public class MinMax {
	private Integer[] values;
	private int currSize;
	
	public MinMax(int maxSize){
		values = new Integer[maxSize];
		currSize = 0;
	}
	
	public int size(){
		return currSize;
	}
	
	public void add(Integer value){
		if (this.currSize != this.values.length){
			this.values[this.currSize++] = value;
		}
	}
	
	public Integer min(){
		Integer x = this.values[0];
		for (Integer e: values){
			if (e != null && e.compareTo(x) < 0){
				x = e;
			}
		}
		return x;
	}
	public Integer max(){
		Integer x = this.values[0];
		for (Integer e: values){
			if (e != null && e.compareTo(x) > 0){
				x = e;
			}
		}
		return x;
	}

}
