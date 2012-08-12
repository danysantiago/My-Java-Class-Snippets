
public class MyMath {
	public static long sumN(long n){
		long total = 0;
		long x = 1;
		while (x <= n){
			total += x;
			x++;
		}
		return total;
	}

}
