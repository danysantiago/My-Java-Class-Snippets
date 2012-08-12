
public class TestPoint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Point P0 = new Point();
		//Point P1 = new Point(2, 3);
		
		Point P0 = Point.pointAtOrigin();
		Point P1 = Point.pointAtCoordinates(2, 3);
		System.out.println("P0: " + P0);
		System.out.println("P1: " + P1);
	}

}
