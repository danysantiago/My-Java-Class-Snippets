/**
 * This class is used as the main program to test the Point data type.
 * @author manuel
 *
 */
public class TestPoint {
	
	public static void main(String[] args){
		// construc two points
		Point P0 = new Point(2, 5);
		Point P1 = new Point(4, 2);
		// print the distance to origin
		System.out.printf("Distance to origin for P0: %f\n", P0.distanceToOrigin());
		System.out.printf("Distance to origin for P1: %f\n", P1.distanceToOrigin());
		
		// print the distance between points
		System.out.printf("Distance between P0 and P1: %f\n", P0.distanceToPoint(P1));
	}

}
