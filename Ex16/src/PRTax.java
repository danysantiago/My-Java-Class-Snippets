
public class PRTax {
	public static final double BRACKET1A = 17000;
	public static final double BRACKET1B = 30000;
	public static final double BRACKET1C = 50000;
	public static final double BRACKET2A = 8500;
	public static final double BRACKET2B = 15000;
	public static final double BRACKET2C = 25000;

	
	private boolean marriedFillSeparate;
	private double adjustedSalary;
	
	public PRTax(boolean marriedFillSeparate, double adjustedSalary) {
		super();
		this.marriedFillSeparate = marriedFillSeparate;
		this.adjustedSalary = adjustedSalary;
	}
	public boolean isMarriedFillSeparate() {
		return marriedFillSeparate;
	}
	public void setMarriedFillSeparate(boolean marriedFillSeparate) {
		this.marriedFillSeparate = marriedFillSeparate;
	}
	public double getAdjustedSalary() {
		return adjustedSalary;
	}
	public void setAdjustedSalary(double adjustedSalary) {
		this.adjustedSalary = adjustedSalary;
	}
	
	public double computeTax(){
		if (this.isMarriedFillSeparate()){
			if (this.adjustedSalary < BRACKET2A){
				return 0.07 * this.adjustedSalary;
			}
			else if (this.adjustedSalary < BRACKET2B){
				return 595 + 0.14* (this.adjustedSalary - BRACKET2A);
			}
			else if (this.adjustedSalary < BRACKET2C){
				return 1505 + 0.25*(this.adjustedSalary - BRACKET2B);
			}
			else {
				return 4005 + 0.33 *(this.adjustedSalary - BRACKET2C);
			}
		}
		else {
			if (this.adjustedSalary < BRACKET1A){
				return 0.07 * this.adjustedSalary;
			}
			else if (this.adjustedSalary < BRACKET1B){
				return 1190 + 0.14* (this.adjustedSalary - BRACKET1A);
			}
			else if (this.adjustedSalary < BRACKET1C){
				return 3010 + 0.25*(this.adjustedSalary - BRACKET1B);
			}
			else {
				return 8010 + 0.33 *(this.adjustedSalary - BRACKET1C);
			}
		}
	}
	

}
