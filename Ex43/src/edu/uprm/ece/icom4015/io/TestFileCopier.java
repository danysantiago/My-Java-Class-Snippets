package edu.uprm.ece.icom4015.io;

import java.util.Scanner;

public class TestFileCopier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the input file name: ");
			String inputName = in.nextLine();
			System.out.println("Enter the output file name: ");
			String outputName = in.nextLine();
			FileCopier fC = new FileCopier(inputName, outputName);
			fC.makeCopy();
			System.out.println("Done!");
		}
		catch(FileCopierException e1){
			//System.out.println("Unable to open file for read/write. You your disk. " + e1);
			e1.printStackTrace();
		}
		catch(Exception e){
			System.out.println("Unexpected error during the operation. Check error trace. " + e);
			e.printStackTrace();

		}
	}

}
