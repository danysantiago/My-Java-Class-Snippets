package edu.uprm.ece.icom4015.shapes;

import java.io.PrintStream;
import java.util.Scanner;

import edu.uprm.ece.icom4015.shapes.io.Printable;
import edu.uprm.ece.icom4015.shapes.io.Readable;

public class Line implements Shape, Printable, Readable{
	private Point start;
	private Point end;
	
	public Line(){
		this.start = new Point();
		this.end = new Point();
	}
	public Line(Point start, Point end) {
		super();
		this.start = start;
		this.end = end;
	}
	
	public Point getStart() {
		return start;
	}

	public Point getEnd() {
		return end;
	}

	public String toString(){
		return "Line(" + this.start + ", " + this.end + ")";
	}
	
	@Override
	public void read(Scanner in) {
		this.start.read(in);
		this.end.read(in);
	}
	@Override
	public void print(PrintStream out) {
		out.print(toString());
	}
	@Override
	public double perimeter() {
		return this.start.distanceToPoint(this.end);
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

}
