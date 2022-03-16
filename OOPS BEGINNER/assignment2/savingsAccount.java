package assignment2;
public class savingsAccount {
	private double balance;
	private int interestRate;
	private int accountNo;
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public savingsAccount(double balance, int interestRate, int accountNo) {
		super();
		this.balance = balance;
		this.interestRate = interestRate;
		this.accountNo = accountNo;
	}
	public savingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void withDraw(double amount) {
		if(amount>balance)
			System.out.println("Insufficient Balance");
		else {
			balance -= amount;
			System.out.println("Succesfully Withdrawn "+amount);
		}
			
	}
	
	public void calculateInterest() {
		balance += balance*(interestRate/100);
	}
	
}
