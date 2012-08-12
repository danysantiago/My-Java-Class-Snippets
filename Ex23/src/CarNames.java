import java.io.PrintStream;


public class CarNames {
	private String[] carList;
	private int currentCapacity;
	
	public CarNames(int maxSize){
		// maxSize >= 1
		assert(maxSize >=1);
		this.carList = new String[maxSize];
		this.currentCapacity = 0;
	}
	
	public String get(int index){
		assert(index >=0 && index < currentCapacity -1);
		return this.carList[index];
	}
	
	public boolean isFull(){
		return currentCapacity == this.carList.length;
	}
	
	public void add(String carName){
		assert(!isFull());
		this.carList[currentCapacity++] = carName;
	}

	/**
	 * Finds a car name in the list and returns the position of the first
	 * ocurrence.
	 * @param carName - the car name to search
	 * @return the position in the list, or -1
	 */
	public int find(String carName){
		// search for name
		
		for (int i=0; i < currentCapacity; ++i){
			if (this.carList[i].equals(carName)){
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * Find the number of copies of a name in the list of names.
	 * @param carName - the name to search for
	 * @return the number of copies (if any) in the list.
	 */
	public int count(String carName){
		int counter = 0;
		
		for (int i=0; i < this.currentCapacity; ++i){
			if (this.carList[i].equals(carName)){
				counter++;
			}
		}
		return counter;
	}
	
	
	public boolean isEmpty(){
		return currentCapacity == 0;
	}
	public String min(){
		if (isEmpty()){
			return null;
		}
		else {
			String candidate = this.carList[0];
			for (int i = 1; i < currentCapacity; ++i){
				if (this.carList[i].compareTo(candidate) < 0){
					candidate = this.carList[i];
				}
			}
			return candidate;
		}
	}
	
	public String max(){
		if (isEmpty()){
			return null;
		}
		else {
			String candidate = this.carList[0];
			for (int i = 1; i < currentCapacity; ++i){
				if (this.carList[i].compareTo(candidate) > 0){
					candidate = this.carList[i];
				}
			}
			return candidate;
		}
	}

	public void print(PrintStream out){
		for (int i=0; i < currentCapacity; ++i){
			out.println(this.carList[i]);
		}
	}
	
}
