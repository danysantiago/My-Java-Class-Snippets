
public class Invest {
	// private fields
	private double initAmount;
	private double yearlySavings;
	public Invest(double initAmount, double yearlySavings) {
		super();
		this.initAmount = initAmount;
		this.yearlySavings = yearlySavings;
	}
	public double getInitAmount() {
		return initAmount;
	}
	public double getYearlySavings() {
		return yearlySavings;
	}
	
	public int yearsToReachSavingsGoal(double goal){
		int years = 0;
		double currentSavings = this.initAmount;
		
		while(currentSavings < goal){
			currentSavings += yearlySavings;
			++years;
		}
		return years;
	}
	//
	// int str = strtoi();
	// Vector V = vmultsca

}
