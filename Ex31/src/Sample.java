
public class Sample {
	
	private int number;
	private String name = "Joe";
	
	private static int counter1 =1;
	private static int counter2;
	
	private static final int MAX = 100;
	
	// static initialize
	static {
		// Msg
		System.out.println("Static block runnning!");
		counter2 = MAX - 10;
	}

	public Sample(String name, int number) {
		super();
		this.number = number;
		this.name = name;
	}
	
	public String toString(){
		return "Sample: number = " + this.number + 
		", name: " + this.name + ", counter1: " + counter1
		+ ", counter2: " + counter2;
	}

	public void modify1(int value){
		this.number *= value;
		Sample.counter1++;
		Sample.counter2 +=value;
	}
}
