package edu.uprm.ece.icom4015.files;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TestFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FileReader fileIn = new FileReader("input.txt");
			Scanner in = new Scanner(fileIn);
			String nextLine;
			while (in.hasNextLine()){
				nextLine = in.nextLine();
				System.out.println(nextLine);
			}
			System.out.println("Good bye!");
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

}
