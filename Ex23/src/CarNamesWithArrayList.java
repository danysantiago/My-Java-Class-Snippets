import java.io.PrintStream;
import java.util.ArrayList;


public class CarNamesWithArrayList {

	public static void main(String args[]){
		ArrayList<String> C = new ArrayList();
		C.add("Ford");
		C.add("BMW");
		C.add("Bentley");
		C.add("Nissan");
		C.add("Toyota");
		C.add("Audi");
		C.add("BMW");
		// get the car at position 0
		System.out.println("car at position 0: " + C.get(0));
		System.out.println("Location of BMW: " + C.indexOf("BMW"));
		System.out.println("Location of Ferrari: " + C.indexOf("Ferrari"));
		System.out.println("Copies of Ferrari: " + count(C, "Ferrari"));
		System.out.println("Copies of BMW: " + count(C, "BMW"));
		System.out.println("Copies of Audi: " + count(C, "Audi"));
		System.out.println("Min element: " + min(C));
		System.out.println("Max element: " + max(C));
		System.out.println("Print all: ");
		print(C, System.out);

	}

	private static void print(ArrayList<String> c, PrintStream out) {
		for (String s : c){
			out.println(s);
		}
	}

	private static String min(ArrayList<String> c) {
		String min = c.get(0);
		for (String s : c){
			if (s.compareTo(min) < 0){
				min = s;
			}
		}
		return min;
	}
	private static String max(ArrayList<String> c) {
		String max = c.get(0);
		for (String s : c){
			if (s.compareTo(max) > 0){
				max = s;
			}
		}
		return max;
	}

	private static int count(ArrayList<String> c, String str) {
		// TODO Auto-generated method stub
		int count =0;
		for (int i=0; i < c.size(); ++i){
			if (c.get(i).equals(str)){
				count++;
			}
		}
		return count;
	}
}
