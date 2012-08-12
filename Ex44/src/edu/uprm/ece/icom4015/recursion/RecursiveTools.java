package edu.uprm.ece.icom4015.recursion;

public class RecursiveTools {
	
	public static long factorial(long n){
		if (n == 0){
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
	}

	public static long factorialIterative(long n){
		long result = 1;
		
		for (long i = n; i > 0; --i){
			result *= i;
		}
		return result;
	}
	
	public static boolean isPalindrome(String str){
		if (str.length() == 0 || str.length() == 1){
			return true;
		}
		else {
			if (str.charAt(0) == str.charAt(str.length()-1)){
				// recursive call
				String temp = str.substring(1, str.length()-1);
				return isPalindrome(temp);
			}
			else {
				return false;
			}
		}
	}
	
	public static double fibonacci(double n){
		if (n == 0){
			return 0;
		}
		else if (n == 1){
			return 1;
		}
		else {
			return fibonacci(n-2) + fibonacci(n-1);
		}
	}
	
	public static double fibonacciIterative(double n){
		if (n <= 2)
			return 1;
		
		long fold = 1;
		long fold2 = 1;
		long fnew = 1;
		
		for (int i = 3; i <= n; i++)
		{
			fnew = fold + fold2;
			fold2 = fold;
			fold = fnew;
		}
		return fnew;
	}
	
	
	
	
	
	
	
}
