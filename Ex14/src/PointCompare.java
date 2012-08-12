
public class PointCompare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Point point1 = new Point(1,1);
		Point point2 = new Point(1,1);
		Point point3 = point1;
		
		if (point1 == point2){
			System.out.println("point1 == point2");
		}
		else {
			System.out.println("point1 != point2");
		}
		
		if (point2 == point3){
			System.out.println("point2 == point3");
		}
		else {
			System.out.println("point2 != point3");
		}
		
		if (point1 == point3){
			System.out.println("point1 == point3");
		}
		else {
			System.out.println("point1 != point3");
		}

	}

}

