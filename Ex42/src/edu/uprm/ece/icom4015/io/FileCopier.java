package edu.uprm.ece.icom4015.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileCopier {
	private String inputName;
	private String outputName;
	
	public FileCopier(String inputName, String outputName){
		if (inputName == null){
			throw new IllegalArgumentException("Cannot pass input file name as null.");
		}
		if (outputName == null){
			throw new IllegalArgumentException("Cannot pass output file name as null.");
		}
		this.inputName = inputName;
		this.outputName = outputName;
	}
	
	public void makeCopy() throws FileNotFoundException{
		FileReader fileIn = new FileReader(this.inputName);
		Scanner in = new Scanner(fileIn);
		PrintWriter out = new PrintWriter(this.outputName);
		String nextLine;
		while(in.hasNextLine()){
			nextLine = in.nextLine();
			out.println(nextLine);
		}
		out.close();
	}

}
