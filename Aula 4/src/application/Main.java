package application;

import java.util.Scanner;
import java.util.ArrayList;

import entites.Account;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int op;
		String name = "";
		double balance = 0;
		ArrayList<Account> accounts = new ArrayList<>();
		
		do {
			System.out.println("\tBANK\n");
			System.out.println("{1} New Account");
			System.out.println("{2} Balance");
			System.out.println("{3} Deposit");
			System.out.println("{4} Withdraw");
			System.out.println("{5} Change Password");
			System.out.println("\n[0] EXIT");
			op = sc.nextInt();
			sc.nextLine();

			switch(op) {
			case 1:
				create_account(name, sc, accounts);
				break;
			
			case 2:
				print_account(sc, accounts);
				break;
				
			case 3:
				
				
				break;
			case 4:
				
				
				break;
			case 5:
				
				
				break;
			}
		} while(op != 0);
		
		sc.close();
	}
	
	public static void create_account(String name, Scanner sc, ArrayList<Account> accounts) {
		System.out.println("\n	NEW ACCOUNT\n");
		System.out.printf("Account Name: ");
		name = sc.nextLine();
		accounts.add(new Account(name));
	}
	
	public static Account find_account(ArrayList<Account> accounts, int Id) {
		for(Account acc : accounts) {
			if(acc.getId() == Id) {
				return acc;
			}
		}
		return null;
	}
	
	public static void print_account(Scanner sc, ArrayList<Account> accounts) {
		int id;
		Account acc;
		System.out.printf("Type your account Id: ");
		id = sc.nextInt();
		sc.nextLine();
		acc = find_account(accounts, id);
		
		System.out.printf("Type your account password: ");
		if(acc.checkPassword(sc.nextLine())) {
			System.out.println(acc);
		}
			
	}
	public static float deposit(Scanner sc, ArrayList<Account> accounts) {
		int id;
		Account acc;
		System.out.printf("Type your account Id: ");
		id = sc.nextInt();
		sc.nextLine();
		acc = find_account(accounts, id);
		
		System.out.printf("Type your account password: ");
		if(acc.checkPassword(sc.nextLine())) {
			System.out.println("Insert your deposit:");
			double dep = sc.nextFloat();
			
			double balance = acc.deposit(dep);
	}
		return balance;
	}
}