
public class MinMaxString {
	private String[] values;
	private int currSize;
	
	public MinMaxString(int maxSize){
		this.values = new String[maxSize];
		this.currSize = 0;
	}

	public int size(){
		return this.currSize;
	}
	
	public void add(String value){
		if (this.currSize != this.values.length){
			this.values[this.currSize++] = value;
		}
	}
	
	public String min(){
		String x = this.values[0];
		for (String e: values){
			if (e != null && e.compareTo(x) < 0){
				x = e;
			}
		}
		return x;
	}
	public String max(){
		String x = this.values[0];
		for (String e: values){
			if (e != null && e.compareTo(x) > 0){
				x = e;
			}
		}
		return x;
	}

}
