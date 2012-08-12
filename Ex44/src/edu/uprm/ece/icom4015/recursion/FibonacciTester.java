package edu.uprm.ece.icom4015.recursion;

import java.util.Scanner;

public class FibonacciTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a positive number: ");
		long n = in.nextLong();	
		double result2 = RecursiveTools.fibonacciIterative(n);
		System.out.printf("Iterative: F(%d) is equal to %.0f\n", n, result2);
		double result = RecursiveTools.fibonacci(n);
		System.out.printf("Recursive: F(%d) is equal to %.0f\n", n, result);
		

		
	}

}
