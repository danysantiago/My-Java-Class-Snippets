
public class SortableString implements Sortable{
	private String value;

	public SortableString(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	public String toString(){
		return value;
	}

	@Override
	public boolean GT(Sortable obj) {
		SortableString temp = (SortableString) obj;
		return this.value.compareTo(temp.value) > 0;
	}

	@Override
	public boolean LT(Sortable obj) {
		SortableString temp = (SortableString) obj;
		return this.value.compareTo(temp.value) < 0;
	}

	
}
