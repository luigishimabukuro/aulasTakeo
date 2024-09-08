package entities;

public class Account {
	
		private static int lastId = 0;
		private String name;
		private int ID;
		private double balance;
		private double limit;
		private int password = 0000;

		public Account() {}
		
		public Account(String name, int password, double balance, double inCome) {
			setName(name);
			setSenha(password);
			setId(++Account.lastId);
			Deposit(balance);
			Limit(inCome, balance);
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

		public void setBalance(double balance) {
			this.balance = balance;
		}

		public double getLimit() {
			return limit;
		}

		public void setLimit(double limit) {
			this.limit = limit;
		}
		
		public int getSenha() {
			return password;
		}

		public void setSenha(int senha) {
			this.password = senha;
		}

		public int getId() {
			return ID;
		}
		
		public void setId(int ID) {
			this.ID = ID;
			
		}
		
		public void Deposit(double balance) {
			this.balance += balance;
		}
		
		public void Withdraw(double withdraw) {
			if(withdraw <= limit) {
				this.balance -= withdraw;				
			}
			else {
				System.out.println("Limit exceeded!");
			}
		}
		
		public String toString() {
			return "Name:" 
					+ name 
					+ "\nID: " 
					+ ID 
					+ "\nAmount: " 
					+ balance
					+ "\nLimit: "
					+ limit + "\n";
		}
		
		public boolean checkPassword(int password) {

			if (this.password == password) {
				return true;
			}
			return false;
		}
		
			public void Limit(double inCome, double balance) {
				this.limit = (inCome*0.25) + (0.1 * balance);
				
			}
			
}

