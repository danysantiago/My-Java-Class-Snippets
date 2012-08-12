package edu.uprm.ece.icom4015.recursion;

import java.util.Scanner;

public class PalindromTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		String str = in.nextLine();
		boolean result = RecursiveTools.isPalindrome(str);
		if (result){
			System.out.printf("%s is a palindrome.", str);
		}
		else {
			System.out.printf("%s is not a palindrome.", str);

		}
		
	}

}
