package edu.uprm.ece.icom4015.geometry1;
import java.lang.Math;
/**
 * This class implemente a two-dimensional point data type.
 * @author Manuel Rodriguez-Martinez
 *
 */
public class Point {
	// private field, represents the x coordinate
	private float x;
	// private field, represents the y coordinate
	private float y;
	
	// Default  Constructor
	public Point(){
		x = 0;
		y = 0;
	}
	// Constructor based on coordinates
	public Point(float newX, float newY){
		x = newX;
		y = newY;
	}
	
	// Accessors
	// Returns the x coordinate
	public float getX(){
		return x;
	}
	
	// Returns the x coordinate
	public float getY(){
		return y;
	}
	
	// Mutators
	// Setter
	public void setX(float newX){
		x = newX;
	}
	
	public void setY(float newY){
		y = newY;
	}
	
	// Returns the distance from this point to the origin
	public float distanceToOrigin(){
		Point origin = new Point();
		return this.distanceToPoint(origin);
	}
	
	// Returns the distance between this point and point P.
	public float distanceToPoint(Point P){
		double temp1 = 0;
		temp1 = (P.getX() - this.getX()) * (P.getX() - this.getX()) ;
		double temp2 = 0;
		temp2 = (P.getY() - this.getY()) * (P.getY() - this.getY()) ;
		return (float) Math.sqrt(temp1 + temp2);
	}
	
	public String toString(){
		return "(" + x + "," + y + ")";
	}
	
	public boolean equals(Point P){
		// Naive code ... :)
		//boolean A = this.getX() == P.getX();
		//boolean B = this.getY()  == P.getY();
		//return A && B;
		
		return this.getX() == P.getX() && this.getY() == P.getY();
	}
	
}
