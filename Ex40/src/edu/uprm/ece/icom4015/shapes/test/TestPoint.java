package edu.uprm.ece.icom4015.shapes.test;

import edu.uprm.ece.icom4015.shapes.Point;
import edu.uprm.ece.icom4015.shapes.Point2D;
import edu.uprm.ece.icom4015.shapes.Point3D;

public class TestPoint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Point P0 = new Point2D(2, 3);
		Point P1 = new Point3D(2, 2, 1);
		System.out.printf("P0.x = %f, P0.y = %f\n", P0.getCoordinate(0), P0.getCoordinate(1));
		System.out.printf("P1.x = %f, P1.y = %f, P1.z = %f\n", P1.getCoordinate(0), P1.getCoordinate(1), 
				P1.getCoordinate(2));
		System.out.println("P0: " + P0);
		P0 = new Point3D(9, -1, 2);
		System.out.println("P0: " + P0);
		// illegal, bacause Point does not have all
		// the functionality of Point3D
		//P1 = new Point(2, 3);
		
		// invalid, cannot see the getZ() method. Need a cast
		//P0.getZ();
		
		// valid, Cast P0 to a Point3D
		((Point3D) P0).getZ();
		// valid, as long as P0 is a refernce to a Point3D
		P1 = (Point3D) P0;
		
		
		P0 = new Point2D();
		// invalid, P0 does not reference a Point3D
		//P1 = (Point3D) P0;
		
		
		Point P2 = new Point2D (2, 3);
		Point P3 = new Point2D (4, 5);
		Point3D P4 = new Point3D (1, 1, 1);
		Point3D P5 = new Point3D (4, 5, 5);
		
		System.out.println("P2 distant to P3: " + P2.distanceToPoint(P3));
		System.out.println("P4 distant to P5: " + P4.distanceToPoint(P5));
		System.out.println("P2 distant to P4: " + P2.distanceToPoint(P4));
		System.out.println("P5 distant to P3: " + P5.distanceToPoint(P3));


		
		
		
	}

}
