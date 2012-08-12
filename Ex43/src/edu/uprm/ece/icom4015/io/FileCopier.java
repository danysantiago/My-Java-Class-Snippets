package edu.uprm.ece.icom4015.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
	
	public void makeCopy() throws FileCopierException{
		FileReader fileIn = null;
		try {
			 fileIn = new FileReader(this.inputName);
		}
		catch(FileNotFoundException e){
			throw new FileCopierException("Cannot open file to read.", e);
		}
		Scanner in = new Scanner(fileIn);
		PrintWriter out = null;
		try {
			out = new PrintWriter(this.outputName);
		}
		catch(FileNotFoundException e){
			throw new FileCopierException("Cannot open file to write.", e);
		}
		finally {
			if (out == null){
				try {
					fileIn.close();
				}
				catch(IOException e){
					throw new FileCopierException("Cannot open file to write and cannot close " + 
							"file to read!", e);
				}
			}
		}
		String nextLine;
		while(in.hasNextLine()){
			nextLine = in.nextLine();
			out.println(nextLine);
		}
		out.close();
	}

}
