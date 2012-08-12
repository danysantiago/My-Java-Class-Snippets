package edu.uprm.ece.icom4015.recursion;

import java.util.Scanner;

public class FactorialTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			
		System.out.println("Enter a positive number: ");
		long n = in.nextLong();
		long result = RecursiveTools.factorial(n);
		System.out.printf("Recursive: %d! is equal to %d\n", n, result);
		result = RecursiveTools.factorialIterative(n);
		System.out.printf("Iterative: %d! is equal to %d\n", n, result);
	}

}
