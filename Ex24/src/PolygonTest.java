
public class PolygonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polygon P = new Polygon(4);
		P.setPoint(0, new Point(-1, 1));
		P.setPoint(1, new Point(4, 1));
		P.setPoint(2, new Point(4, -3));
		P.setPoint(3, new Point(-1, -3));
		System.out.println("Polygon: " + P.toString());
		System.out.println("Polygon perimeter: " + P.perimeter());
	}

}
