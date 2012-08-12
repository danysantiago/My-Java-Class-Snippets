




public class Scope {
	private int value1;
	private String value2;
	
	public Scope(int v1, String v2){
		int val1 = v1;
		this.value1 = v1;
		value2 = v2;
		
	}
	
	public Scope(String value2){
		value1 = 0;
		this.value2 = value2;
	}
	
	public void method1(int value1){
		this.value1 += value1;
		int n1 = 9;
		{
			int n2 = 90;
			// will cause a name clash
			//int n1 = 100;
		}
	}
	
	
	public void method2(int n){
		int result = n + value1;
		// this declaration causes a name clash with the inner block
		//int k = 80;
		{
			int k = 9;
			n = n + k;
		}
		// this one is OK becuase the inner block is destroyed
		// by the time we reach here
		int k = 90;
		n = n + k;
	}

}
