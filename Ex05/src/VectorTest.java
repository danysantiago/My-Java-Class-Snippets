import static org.junit.Assert.*;

import org.junit.Test;


public class VectorTest {

	@Test
	public void testVector() {
		Vector V = new Vector();
		assertTrue(V.getX() == 0.0 && V.getY() == 0 && V.getZ() == 0);
	}

	@Test
	public void testVectorDoubleDoubleDouble() {
		Vector V = new Vector(2, 3, 9);
		assertTrue(V.getX() == 2.0 && V.getY() == 3.0 && V.getZ() == 9.0);
	}

	@Test
	public void testGetX() {
		Vector V = new Vector(22, 13, 19);
		assertTrue(V.getX() == 22);
	}

	@Test
	public void testGetY() {
		Vector V = new Vector(22, 13.123123123, 19);
		assertTrue(V.getY() == 13.123123123);
	}

	@Test
	public void testGetZ() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetX() {
		Vector V = new Vector();
		V.setX(9000);
		assertTrue(V.getX() == 9000);
	}

	@Test
	public void testSetY() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetZ() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testEqualsVector() {
		Vector V1 = new Vector (9.2, 5, 1);
		Vector V2 = new Vector (9.2, 5, 1);
		Vector V3 = new Vector();
		assertTrue(V1.equals(V2));
		assertFalse(V3.equals(V1));
	}

	@Test
	public void testMagnitude() {
		Vector V = new Vector (2.1, 3.0, 4);
		assertTrue(V.magnitude() == Math.sqrt(2.1*2.1 + 3.0*3.0 + 4*4));
	}

	@Test
	public void testSum() {
		Vector V1 = new Vector (3, 4, 2);
		Vector V2 =new Vector (1, 1, 1);
		Vector V3 = new Vector (4, 5, 3);
		assertTrue(V1.sum(V2).equals(V3));
	}

	@Test
	public void testSubstract() {
		fail("Not yet implemented");
	}

	@Test
	public void testCrossProduct() {
		fail("Not yet implemented");
	}

	@Test
	public void testInnerProduct() {
		fail("Not yet implemented");
	}

	@Test
	public void testScalarProduct() {
		fail("Not yet implemented");
	}

	@Test
	public void testUnitVector() {
		fail("Not yet implemented");
	}

	@Test
	public void testObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetClass() {
		fail("Not yet implemented");
	}

	@Test
	public void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testEqualsObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testClone() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString1() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testWait() {
		fail("Not yet implemented");
	}

	@Test
	public void testFinalize() {
		fail("Not yet implemented");
	}

}
