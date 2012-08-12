package edu.uprm.ece.icom4015.io;

public class FileCopierException extends Exception {
	FileCopierException(){
		super();
	}
	
	FileCopierException(String msg){
		super(msg);
	}
	
	FileCopierException(String msg, Throwable e){
		super(msg, e);
	}

}
