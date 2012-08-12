
public class Primitives {
	private int value;

	public Primitives(int value) {
		super();
		this.value = value;
		
	}

	public int getValue() {
		return value;
	} 
	
	public void setValue(int newValue){
		this.value = newValue;
	}
	
	public void makeCopy(int copyValue){
		copyValue = this.value;
	}

	@Override
	public String toString() {
		return "Primitives [value=" + value + "]";
	}

	
}
