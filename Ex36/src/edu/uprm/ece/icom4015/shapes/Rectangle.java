package edu.uprm.ece.icom4015.shapes;

import java.io.PrintStream;
import java.util.Scanner;

import edu.uprm.ece.icom4015.shapes.io.Printable;
import edu.uprm.ece.icom4015.shapes.io.Readable;

public class Rectangle implements Shape, Printable, Readable {
	private Point lowerLeft;
	private Point upperRight;
	
	

	public Rectangle() {
		super();
		this.lowerLeft = new Point();
		this.upperRight = new Point();
	
	}

	public Rectangle(Point lowerLeft, Point upperRight) {
		super();
		this.lowerLeft = lowerLeft;
		this.upperRight = upperRight;
	}

	public String toString(){
		return "R(" + this.lowerLeft + ", " + this.upperRight + ")";
	}
	@Override
	public void read(Scanner in) {
		this.lowerLeft.read(in);
		this.upperRight.read(in);
	}

	@Override
	public void print(PrintStream out) {
		out.print(toString());
	}

	@Override
	public double perimeter() {
		Point temp = new Point(this.lowerLeft.getX(), this.upperRight.getY());
		return 2* (lowerLeft.distanceToPoint(temp) + temp.distanceToPoint(upperRight));
	}

	@Override
	public double area() {
		Point temp = new Point(this.lowerLeft.getX(), this.upperRight.getY());
		return lowerLeft.distanceToPoint(temp) * temp.distanceToPoint(upperRight);
	}

}
