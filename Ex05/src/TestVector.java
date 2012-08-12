
public class TestVector {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Constructors
		Vector V0 = new Vector();
		Vector V1 = new Vector(9, 2, 0);
		System.out.printf("V0: %s\n", V0);
		System.out.println("V1: " + V1);
		// Test getters
		System.out.printf("V1.x: %f, V1.y: %f, V1.z: %f\n", V1.getX(), V1.getY(), V1.getZ());
		// Setters
		V1.setX(90);
		V1.setY(14);
		V1.setZ(-9);
		System.out.println("V1: " + V1);
		// Equal
		System.out.println("V1.equals(V1): " + V1.equals(V1));
		System.out.println("V1.equals(V0): " + V1.equals(V0));
		Vector V2 = new Vector(2, 1, 3);
		System.out.println("V2.magnitude(): "+ V2.magnitude());
		Vector V3 = V1.sum(V2);
		System.out.printf("V1 + V2 = V3: %s, expected (92, 15, -6)\n", V3);
		Vector V4 = V1.substract(V2);
		System.out.printf("V1 - V2 = V4: %s, expected (88, 13, -12)\n", V4);
		Vector V5 = V1.crossProduct(V2);
		System.out.printf("V1 x V2 = V5: %s\n", V5);
		System.out.println("V1.innerProduct(V2) = " + V1.innerProduct(V2) + ", expected: 167");
		Vector V6 = new Vector (1, 2, 3);
		System.out.printf("V6.scalarProduct(5): %s\n", V6.scalarProduct(5));
		System.out.printf("V6.unitVector(): %s\n", V6.unitVector());
		System.out.printf("V6.unitVector().magnitude(): %s\n", V6.unitVector().magnitude());
	
		
		
		
	
	
	}

}
