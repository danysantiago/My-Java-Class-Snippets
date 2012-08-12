
public class Account {
	private String number;
	private double balance;
	private static int counter = 0;
	/**
	 * Builds a new account based on a number and 
	 * initial balance
	 * @param number - the five digit account number
	 * @param balance - the initial balance in the account.
	 * Pre-conditions: balance >=0 && number != null && number is five-digit.
	 * Post-conditions: new account will have a balance >= 0 
	 */
	public Account(String number, double balance) {
		super();
		this.number = number + counter;
		Account.counter++;
		this.balance = balance;
	}
	/**
	 * Returns the account number.
	 * @return five-digit string representing account number 
	 */
	public String getNumber() {
		return number;
	}
	
	/**
	 * Returns the current balance.
	 * @return double indicating the current balance.
	 */
	public double getBalance() {
		return balance;
	}
	
	/**
	 * Adds a amount of money to the account.
	 * @param amount- the amount of money to be added.
	 * Pre-condition: amount >= 0
	 * Post-condition: balance = balance + amount && balance >=0 
	 */
	public void deposit(double amount){
		this.balance += amount;
	}
	/**
	 * Removes a certain amount of money from the account.
	 * @param amount - the amount of money to remove.
	 * Pre-condition: balance >= amount && amount >=0
	 * Post-condition: balance = balance - amount && balance >=0
	 */
	public void withdraw(double amount){
		this.balance -= amount;
	}
	

}
