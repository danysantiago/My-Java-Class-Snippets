package edu.uprm.ece.icom4015.shapes;

import java.io.PrintStream;
import java.util.Scanner;

import edu.uprm.ece.icom4015.shapes.io.Printable;
import edu.uprm.ece.icom4015.shapes.io.Readable;

public class Point implements Shape, Printable, Readable{
	
	private double x;
	private double y;
	
	

	public Point() {
		super();
		this.x = 0;
		this.y = 0;
	}

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	// Returns the distance from this point to the origin
	public double distanceToOrigin(){
		Point origin = new Point();
		return this.distanceToPoint(origin);
	}
	
	// Returns the distance between this point and point P.
	public double distanceToPoint(Point P){
		double temp1 = 0;
		temp1 = (P.getX() - this.getX()) * (P.getX() - this.getX()) ;
		double temp2 = 0;
		temp2 = (P.getY() - this.getY()) * (P.getY() - this.getY()) ;
		return (float) Math.sqrt(temp1 + temp2);
	}
	

	@Override
	public double perimeter() {
		return 0;
	}

	@Override
	public double area() {
		return 0;
	}

	public String toString(){
		return "(" + this.x + ", " + this.y + ")";
	}
	
	@Override
	public void read(Scanner in) {
		this.x = in.nextDouble();
		this.y = in.nextDouble();
	}

	@Override
	public void print(PrintStream out) {
		out.print(toString());
	}

}
