package edu.uprm.ece.icom4015.shapes;

public interface Point extends Shape{
	public double distanceToOrigin();
	public double distanceToPoint(Point P);
	public int dimensionality();
	public double getCoordinate(int position);
	public void setCoordinate(int position, double value);
}
