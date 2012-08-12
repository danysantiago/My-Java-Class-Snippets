package edu.uprm.ece.icom4015.shapes;

import java.io.PrintStream;
import java.util.Scanner;

import edu.uprm.ece.icom4015.shapes.io.Printable;
import edu.uprm.ece.icom4015.shapes.io.Readable;


public abstract class AbstractPoint implements Point, Readable, Printable{
	protected double[] coordinates;
	
	protected AbstractPoint(int dimensions){
		assert(dimensions >= 1);
		this.coordinates = new double[dimensions];
	}
	
	public int dimensionality(){
		return this.coordinates.length;
	}
	
	public double getCoordinate(int position){
		assert(position >=0 && position < this.coordinates.length);
		return this.coordinates[position];
	}
	
	@Override
	public void setCoordinate(int position, double value) {
		assert(position >=0 && position < this.coordinates.length);
		this.coordinates[position]  = value;
	}


	public double perimeter(){
		return 0.0;
	}
	public double area(){
		return 0.0;
	}
	
	public void print(PrintStream out){
		out.print(toString());
	}
	
	public void read(Scanner in){
		for (int i=0; i < this.coordinates.length; ++i){
			this.coordinates[i] = in.nextDouble();
		}
	}
	
	public String toString(){
		return localToString();
	}
	
	protected abstract String localToString();
	
}
