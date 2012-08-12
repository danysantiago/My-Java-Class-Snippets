package edu.uprm.ece.icom4015.shapes;

import java.io.PrintStream;
import java.util.Scanner;

import edu.uprm.ece.icom4015.shapes.io.Printable;
import edu.uprm.ece.icom4015.shapes.io.Readable;

public class Point3D implements Shape, Printable, Readable {
	private double x;
	private double y;
	private double z;
	
	public Point3D() {
		super();
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}

	public Point3D(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getZ() {
		return z;
	}

	@Override
	public void read(Scanner in) {
		this.x= in.nextDouble();
		this.y = in.nextDouble();
		this.z = in.nextDouble();
	}

	@Override
	public void print(PrintStream out) {
		out.print(toString());
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String toString(){
		return "(" + this.x + ", " + this.y + ", " + this.z + ")";
	}
	
	// Returns the distance from this point to the origin
	public double distanceToOrigin(){
		Point3D origin = new Point3D();
		return this.distanceToPoint(origin);
	}
	
	// Returns the distance between this point and point P.
	public double distanceToPoint(Point3D P){
		double temp1 = 0;
		temp1 = (P.getX() - this.getX()) * (P.getX() - this.getX()) ;
		double temp2 = 0;
		temp2 = (P.getY() - this.getY()) * (P.getY() - this.getY()) ;	
		double temp3 = 0;
		temp3 = (P.getZ() - this.getZ()) * (P.getZ() - this.getZ()) ;
		return (float) Math.sqrt(temp1 + temp2+temp3);
	}


}
