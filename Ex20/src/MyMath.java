
public class MyMath {
	public static long sumNSqr(long n){
		long total = 0;
		long i = 1;
		while (i <= n){
			total += i*i;
			++i;
		}
		return total;
	}
}
