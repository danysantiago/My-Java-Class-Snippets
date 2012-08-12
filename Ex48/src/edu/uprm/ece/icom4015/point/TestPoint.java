package edu.uprm.ece.icom4015.point;

public class TestPoint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point<Integer> P1 = new Point<Integer>(3, 2);
		Point<Double> P2 = new Point<Double>(0.2, 3.2);
		Point<String> P3 = new Point<String>("Amy", "Bob");
		
		System.out.println("P1: " + P1);
		System.out.println("P2: " + P2);
		System.out.println("P3: " + P3);
		
		NumericPoint<Integer> P4 = new NumericPoint<Integer>(1, 10);
		NumericPoint<Float> P5 = new NumericPoint<Float>(0.001f,2.0f);
		System.out.println("P4: " + P4);
		System.out.println("P5: " + P5);
		// Error
		//NumericPoint<String> P6 = new NumericPoint<String>("Amy", "Bob");

		//NumericPoint<Number> P7 = (NumericPoint<Number>) new NumericPoint<Integer>(9, 9);

	}

}
