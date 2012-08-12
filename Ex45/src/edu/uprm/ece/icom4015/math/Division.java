package edu.uprm.ece.icom4015.math;

public class Division extends ArithmeticExpression {

	public Division(Expression leftHand, Expression rightHand) {
		super(leftHand, rightHand);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getValue() {
		// TODO Auto-generated method stub
		return leftHand.getValue() / rightHand.getValue();
	}

	@Override
	protected String localToString() {
		// TODO Auto-generated method stub
		return "(" + leftHand + "/" + rightHand + ")";
	}

}
