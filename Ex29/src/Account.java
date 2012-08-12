
public class Account {
	private String number;
	private double balance;
	public Account(String number, double balance) {
		super();
		this.number = number;
		this.balance = balance;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void withdraw(double amount){
		if (this.balance >= amount){
			this.balance -= amount;
		}
		else {
			this.balance = 0;
		}
		
	}
	
	public void transfer(double amount, Account destination){
		if (this.balance >= amount) {
			destination.balance += amount;
			this.balance -= amount;
		}
		else {
			destination.balance += this.balance;
			this.balance = 0;
		}
	}
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	
	
	
}
