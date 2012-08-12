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
}
