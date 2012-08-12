
public class SortableInteger implements Sortable{
	private int value;
	
	public SortableInteger(int value){
		this.value = value;
	}

	public int getValue(){
		return value;
	}
	
	public String toString(){
		return this.value +"";
	}
	public boolean GT(Sortable obj){
		SortableInteger temp = (SortableInteger) obj;
		return this.value > temp.value;
	}
	public boolean LT(Sortable obj){
		SortableInteger temp = (SortableInteger) obj;
		return this.value < temp.value;

	}


}
