package edu.uprm.ece.icom4015.files;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestFile2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FileReader fileIn = new FileReader("input.txt");
			Scanner in = new Scanner(fileIn);
			PrintWriter out = new PrintWriter("output.txt");
			String nextLine;
			while (in.hasNextLine()){
				nextLine = in.nextLine();
				out.println(nextLine);
			}
			out.close();
			System.out.println("Good bye!");
		}
		catch(IOException e){
			e.printStackTrace();
		}

	}

}
