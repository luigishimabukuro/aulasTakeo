package entites;

public class Account {
	private int accountNumber;
	private String name;
	private double balance;
	private double limit;
	
	public Account(int accountNumber, String name, double balance, double limit) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.limit = limit;
	}
	
	public Account() {
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public double getLimit() {
		return limit;
	}
	public void setLimit(double limit) {
		this.limit = limit;
	}
	
	public String toString() {
		return "Number: "
		+ accountNumber
		+ "\nName: "
		+ name
		+ "\nBalance: "
		+ balance
		+"\nLimit: "
		+ limit
		+ "\n";
	}
}
