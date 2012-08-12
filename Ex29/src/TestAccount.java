
public class TestAccount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account savings = new Account("savings", 1000);
		Account checking = new Account("checking", 100);
		
		System.out.println("Checking: " + checking.getBalance());
		System.out.println("Savings: "  + savings.getBalance());
		
		savings.withdraw(100);
		System.out.println("Checking: " + checking.getBalance());
		System.out.println("Savings: "  + savings.getBalance());

		savings.transfer(100, checking);
		System.out.println("Checking: " + checking.getBalance());
		System.out.println("Savings: "  + savings.getBalance());
		
		double amount = 100;
		savings.withdraw(amount);
		checking.deposit(amount);
		System.out.println("Checking: " + checking.getBalance());
		System.out.println("Savings: "  + savings.getBalance());
}

}
