package edu.uprm.ece.icom4015.point;

public class Point<T> {
	T x;
	T y;
	public Point(T x, T y) {
		super();
		this.x = x;
		this.y = y;
	}
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
	
	public String toString(){
		return "(" + x + ", " + y + ")";
	}

}
