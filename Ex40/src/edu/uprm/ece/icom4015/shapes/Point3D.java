package edu.uprm.ece.icom4015.shapes;

public class Point3D extends AbstractPoint {

	public Point3D(){
		super(3);
		setCoordinate(0, 0);
		setCoordinate(1, 0);
		setCoordinate(2, 0);
	}

	public Point3D(double x, double y, double z){
		super(3);
		setCoordinate(0, x);
		setCoordinate(1, y);
		setCoordinate(2, z);
	}
	
	public double getX(){
		return this.coordinates[0];
	}

	public double getY(){
		return this.coordinates[1];
	}

	public double getZ(){
		return this.coordinates[2];
	}

	@Override
	public double distanceToOrigin() {
		Point3D O = new Point3D();
		return this.distanceToPoint(O);
	}

	@Override
	public double distanceToPoint(Point P) {
		if (P instanceof Point3D){
			double temp1, temp2, temp3;
			Point3D tempP = (Point3D) P;
			temp1 = this.getX() - tempP.getX();
			temp1 *= temp1;
			temp2 = this.getY() - tempP.getY();
			temp2 *= temp2;
			temp3 = this.getZ() - tempP.getZ();
			temp3 *= temp3;

			return Math.sqrt(temp1+temp2+temp3);
		}
		else {
			if (this.dimensionality() < P.dimensionality()){
				return P.distanceToPoint(this);
			}
			else {
				Point3D temp = new Point3D();
				for (int i=0; i < P.dimensionality(); ++ i){
					temp.setCoordinate(i, P.getCoordinate(i));
				}
				return this.distanceToPoint(temp);
			}
		}
	}

	@Override
	protected String localToString() {
		return "(" + this.getX() + ", " + this.getY() + ", " + this.getZ() + ")";
	}

}
