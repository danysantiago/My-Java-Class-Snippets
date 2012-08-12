/**
 * This class implement a vector in a 3d space.
 * @author Manuel Rodriguez-Martinez
 *
 */
public class Vector {
	// x coordinate
	private double x;
	// y coordinate
	private double y;
	// z coordinate
	private double z;
	/*
	 * Now comes the declaration of methods.
	 */
	
	/**
	 * Default constructor. Creates a point at the origin.
	 */
	public Vector(){
		x = 0.0;
		y = 0.0;
		z = 0.0;
		
	}
	
	/**
	 * Constructor based on three coordinate
	 * @param x x coordinate 
	 * @param y y coordinate
	 * @param z z coordinate
	 */
	public Vector(double x, double y, double z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	/**
	 * Returns the current value of the x coordinate.
	 * @return double with the current of x.
	 */
	public double getX(){
		return x;
	}

	
	public double getY(){
		return y;
	}

	public double getZ(){
		return z;
	}

	/**
	 * Change the current value of x to a new value.
	 * @param x the new replacement value.
	 */
	public void setX(double x){
		this.x = x;
	}
	
	public void setY(double y){
		this.y = y;
	}
	
	public void setZ(double z){
		this.z = z;
	}

	/**
	 * Returns the string representation of the vector. This representation is
	 * of the form (x, y, z).
	 * @return string representing the value of the vector.
	 */
	public String toString(){
		// return "(" + this.x + ", " + this.y + ", " + this.z + ")";
		return "(" + x + ", " + y + ", " + z + ")";
	}
	/**
	 * Determines if another vector V is equal to this vector. This 
	 * determination is based on whether both vector have the same coordinates.
	 * @param V  the vector for the comparison.
	 * @return true if both vectors have the same coordinates, or false otherwise.
	 */
	public boolean equals(Vector V){
		
		// V0.equals(V1);
		return this.x == V.x && this.y == V.y && this.z == V.z;
	}
	
	public double magnitude(){
		double temp1 = this.x * this.x;
		double temp2 = this.y * this.y;
		double temp3 = this.z * this.z;
		return Math.sqrt(temp1 + temp2 + temp3);
	}
	
	public Vector sum(Vector V){
		// easy
		double temp1 = this.x + V.x;
		double temp2 = this.y + V.y;
		double temp3 = this.z + V.z;
		return new Vector(temp1, temp2, temp3);
	}
	
	public Vector substract(Vector V){
		// guillau
		return new Vector(this.x - V.x, this.y - V.y , this.z - V.z);
	}
	
	public Vector crossProduct(Vector V){
		// easy
		double temp1 = this.y*V.z - V.y*this.z;
		double temp2 = this.x*V.z - V.x*this.z;
		double temp3 = this.x*V.y - V.x * this.y;
		return new Vector(temp1, -temp2, temp3);
	}

	public double innerProduct(Vector V){
		// guillau
		return this.x*V.x + this.y*V.y + this.z*V.z;
	}
	
	public Vector scalarProduct(double c){
		return new Vector(c*this.x, c* this.y, c*this.z);
	}
	
	public Vector unitVector(){
		// guillau
		//return new Vector(this.x/this.magnitude(), this.y/this.magnitude(), this.z/this.magnitude());
	
		// super guillau
		return this.scalarProduct(1/this.magnitude());
	}
	
	

	
	
	
	
	
	
	
	
	
	
	

}
