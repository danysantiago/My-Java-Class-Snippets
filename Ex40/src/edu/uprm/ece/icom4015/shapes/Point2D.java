package edu.uprm.ece.icom4015.shapes;

public class Point2D extends AbstractPoint {

	
	public Point2D(){
		super(2);
		this.coordinates[0] = 0;
		this.coordinates[1] = 0;
	
	}
	public Point2D(double x, double y) {
		super(2);
		this.coordinates[0] = x;
		this.coordinates[1] = y;
	}

	public double getX(){
		return this.coordinates[0];
	}

	public double getY(){
		return this.coordinates[1];
	}

	@Override
	public double distanceToOrigin() {
		Point2D O = new Point2D();
		return this.distanceToPoint(O);
	}

	@Override
	public double distanceToPoint(Point P) {
		if (P instanceof Point2D){
			double temp1, temp2;
			Point2D tempP = (Point2D) P;
			temp1 = this.getX() - tempP.getX();
			temp1 *= temp1;
			temp2 = this.getY() - tempP.getY();
			temp2 *= temp2;
			return Math.sqrt(temp1+temp2);
		}
		else {
			return P.distanceToPoint(this);
		}
	}


	@Override
	protected String localToString() {
		return "(" + this.getX() + ", " + this.getY() + ")";
	}
	

}
