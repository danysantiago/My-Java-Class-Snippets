package edu.uprm.ece.icom4015.math;

public class Numeric implements Expression {
	
	private double value;
	
	public Numeric(){
		this.value = 0;
	}
	
	public Numeric(double value){
		this.value = value;
	}

	@Override
	public double getValue() {
		return this.value;
	}

	public void setValue(double value){
		this.value = value;
	}
	public String toString(){
		return "" + this.getValue();
	}
}
