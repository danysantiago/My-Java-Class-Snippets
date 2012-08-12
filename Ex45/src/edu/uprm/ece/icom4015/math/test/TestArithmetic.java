package edu.uprm.ece.icom4015.math.test;

import edu.uprm.ece.icom4015.math.Expression;
import edu.uprm.ece.icom4015.math.Multiply;
import edu.uprm.ece.icom4015.math.Numeric;
import edu.uprm.ece.icom4015.math.Substract;
import edu.uprm.ece.icom4015.math.Sum;

public class TestArithmetic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Expression exp1 = new Numeric(5);
		Expression exp2 = new Numeric(4);
		Expression exp3 = new Sum(exp1, exp2);
		Expression exp4 = new Multiply(exp3, exp1);
		Expression exp5 = new Substract(exp3, exp4);
		System.out.printf("exp1: %s, value: %.0f\n", exp1, exp1.getValue());
		System.out.printf("exp2: %s, value: %.0f\n", exp2, exp2.getValue());
		System.out.printf("exp3: %s, value: %.0f\n", exp3, exp3.getValue());
		System.out.printf("exp4: %s, value: %.0f\n", exp4, exp4.getValue());
		System.out.printf("exp5: %s, value: %.0f\n", exp5, exp5.getValue());

	}

}
