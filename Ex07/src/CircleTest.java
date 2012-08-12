import static org.junit.Assert.*;

import org.junit.Test;


public class CircleTest {

	@Test
	public void testCircle() {
		Circle C = new Circle();
		assertTrue(C.getRadius() == 1.0);
	}

	@Test
	public void testCircleDouble() {
		Circle C = new Circle(12.32);
		assertTrue(C.getRadius() == 12.32);
	}

	@Test
	public void testDiameter() {
		Circle C = new Circle(12.32);
		double d1 = C.diameter();
		double d2 = 12.32 * 2;
		assertTrue(d1 == d2);
		
	}

	@Test
	public void testCircumference() {
		Circle C = new Circle(5);
		double d1 = C.circumference();
		double d2 = 2 * Circle.PI * C.getRadius();
		assertTrue(d1 == d2);
	
	}

	@Test
	public void testArea() {
		Circle C = new Circle(5);
		double d1 = C.area();
		double d2 = Circle.PI * 5 * 5;
		// DEBUG
		//System.out.printf("d1: %f, d2: %f\n", d1, d2);
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		System.out.println("|d1 - d2| = " + Math.abs(d1-d2));
		//assertTrue(d1 == d2);
		double epsilon = 0.001;
		double difference = d1 - d2;
		assertTrue(Math.abs(difference) < epsilon);
	}

	@Test
	public void testToString() {
		Circle C = new Circle(4.3);
		// Recall
		// C.toString().equals("C<4.3>");
		// same as
		// String str = C.toString();
		// str.equals("C<4.3>");
		assertTrue(C.toString().equals("C<4.3>"));
	}

	@Test
	public void testEqualsCircle() {
		Circle C0 = new Circle(43.2);
		Circle C1 = new Circle(43.2);
		Circle C2 = new Circle(10);

		assertTrue(C0.equals(C1));
		assertFalse(C0.equals(C2));
		
		
		
		
		
		
	}

}
