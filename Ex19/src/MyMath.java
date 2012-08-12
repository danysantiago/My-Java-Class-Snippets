
public class MyMath {
	
	public static long sumN(long n){
		long total = 0;
		
		for (long i=1; i <= n; ++i){
			total += i;
		}
		return total;
	}

	public static long evenSumN(long n){
		long total = 0;
		for (long i = 1; i <= n; ++i){
			if (i % 2 == 0) {
				total += i;
			}
		}
		return total;
	}
	
	public static long factorial(long n){
		long result = 1;
		
		for (long i = n; i > 0; --i) {
			result *= i;
		}
		return result;
	}
}
