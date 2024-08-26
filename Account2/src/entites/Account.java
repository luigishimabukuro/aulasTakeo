package entites;

import java.util.ArrayList;
import java.util.Scanner;

public class Account {
	private int accountNumber;
	private String name;
	private double balance = 0.0;
	private double limit;
	private String password;
	
	

	
	public Account(int accountNumber, String name, double balance, double limit) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = 0.0;
		this.limit = limit;
		this.password = "0000";
		}
	
	public static void  Menu() {
		ArrayList<Account> conta = new ArrayList<>();
		
		System.out.print("======MENU======\n"
				+ "[1] Cadastrar uma conta\n"
				+ "[2] Depositar\n"
				+ "[3] Retirar\n"
				+ "[4] Trocar senha\n"
				+"================");
		int num = 0;
		switch(num){
			case 1:
			Cadastro(conta);
			case 2:
			deposit();
		} 
		
	} 
	
	public Account() {
	}
	
	public static void Cadastro(Arraylist<Account> conta) {
		Scanner sc = new Scanner(System.in);

		
		System.out.println();
		System.out.print("Insira o nome do proprietário da conta: \n");
		name = sc.nextLine();
	}
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public static String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	public double withdraw(double withdraw) {
		return balance -= withdraw;
		
	}
	
	public double deposit (double deposit) {
		return balance += deposit;
	}
	
	
	public String changePass(String OldPass, String NewPass) {
		do {
		if (OldPass == password) {
			System.out.print("Insira a nova senha.\n");
			NewPass = sc.nextLine();
		}
		else {
			System.out.print("Senha incorreta, tente novamente!\n");
		}
			
		}while(OldPass == password);
		
		this.password = NewPass;
		
		return password;
	}
	
	
	
	
	
}