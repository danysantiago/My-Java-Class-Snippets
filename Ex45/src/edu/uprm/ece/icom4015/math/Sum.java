package edu.uprm.ece.icom4015.math;

public class Sum extends ArithmeticExpression {

	public Sum(Expression leftHand, Expression rightHand){
		super(leftHand, rightHand);
	}
	@Override
	public double getValue() {
		return leftHand.getValue() + rightHand.getValue();
	}

	@Override
	protected String localToString() {
		// TODO Auto-generated method stub
		return "(" + leftHand + "+" + rightHand + ")";
	}

}
