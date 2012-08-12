package edu.uprm.ece.icom4015.shapes;

import java.util.Scanner;

public class Point3D extends Point {
	private double z;
	
	public Point3D(){
		super();
		this.z = 0;
	}
	public Point3D (double x, double y, double z){
		super(x, y);
		this.z = z;
	}

	public double getZ(){
		return this.z;
	}
	
	public String toString(){
		return "(" + this.getX() + ", " + this.getY() + ", " + this.z + ")";
	}
	
	public void read(Scanner in){
		super.read(in);
		this.z = in.nextDouble();
	}
	
	public double distanteToOrigin(){
		Point3D O = new Point3D();
		return this.distanceToPoint(O);
	}
	
	public double distanceToPoint(Point P){
		if (P instanceof Point3D){
			Point3D P1 = (Point3D) P;
			double temp1, temp2, temp3;
			temp1 = this.getX() - P1.getX();
			temp1 *= temp1;
			temp2 = this.getY() - P1.getY();
			temp2 *= temp2;
			temp3 = this.getZ() - P1.getZ();
			temp3 *= temp3;
			return Math.sqrt(temp1 + temp2 + temp3);
		}
		else {
			// assume that is of smaller dimensionality
			Point3D temp = new Point3D(P.getX(), P.getY(), 0);
			return this.distanceToPoint(temp);
		}
	}
	
	
	
	
	
	
}
