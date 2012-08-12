
public class PrimitiveUser {
	private Primitives pValue;

	public PrimitiveUser(Primitives pValue) {
		super();
		this.pValue = pValue;
	}

	public Primitives getpValue() {
		return pValue;
	}

	public void setpValue(Primitives pValue) {
		this.pValue = pValue;
	}
	
	public void sideEffect(Primitives target){
		target.setValue(pValue.getValue());
	}
	public void sideEffect2(Primitives target){
		target = new Primitives(pValue.getValue());
	}

}
