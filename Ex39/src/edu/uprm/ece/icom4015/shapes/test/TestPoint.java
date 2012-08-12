package edu.uprm.ece.icom4015.shapes.test;

import edu.uprm.ece.icom4015.shapes.Point;
import edu.uprm.ece.icom4015.shapes.Point3D;

public class TestPoint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Point P0 = new Point(2, 3);
		Point3D P1 = new Point3D(2, 2, 1);
		System.out.printf("P0.x = %f, P0.y = %f\n", P0.getX(), P0.getY());
		System.out.printf("P1.x = %f, P1.y = %f, P1.z = %f\n", P1.getX(), P1.getY(), P1.getZ());
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
		
		
		P0 = new Point();
		// invalid, P0 does not reference a Point3D
		//P1 = (Point3D) P0;
		
		
		Point P2 = new Point (2, 3);
		Point P3 = new Point (4, 5);
		Point3D P4 = new Point3D (1, 1, 1);
		Point3D P5 = new Point3D (4, 5, 5);
		
		System.out.println("P2 distant to P3: " + P2.distanceToPoint(P3));
		System.out.println("P4 distant to P5: " + P4.distanceToPoint(P5));
		System.out.println("P2 distant to P4: " + P2.distanceToPoint(P4));
		System.out.println("P5 distant to P3: " + P5.distanceToPoint(P3));


		
		
		
	}

}
