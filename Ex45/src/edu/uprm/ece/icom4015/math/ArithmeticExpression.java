package edu.uprm.ece.icom4015.math;

public abstract class ArithmeticExpression implements Expression {

	protected Expression leftHand;
	protected Expression rightHand;
	
	public ArithmeticExpression(Expression leftHand, Expression rightHand) {
		super();
		this.leftHand = leftHand;
		this.rightHand = rightHand;
	}
	
	public final String toString(){
		return localToString();
	}
	
	protected abstract String localToString();
	
}
