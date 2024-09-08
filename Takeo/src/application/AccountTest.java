package application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Account;

public class AccountTest {

	public static void main(String[] args) {

		ArrayList<Account> account = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		int operation;

		do {
			System.out.println("\n	BANK\n");
			System.out.println("[1] New Account");
			System.out.println("[2] Login");
			System.out.println("[3] EXIT");
			System.out.print("Wicth operation? ");
			operation = sc.nextInt();
			sc.nextLine();

			switch (operation) {
			case 1:
				create_account(account, sc);
				break;

			case 2:
				login(account, sc);
				break;

			case 3:
				System.out.println("Leaving the Bank!");
				break;

			default:
				System.out.println("Invalid Operation!!");
				break;
			}
		} while (operation != 3);

		sc.close();
	}

	public static void create_account(ArrayList<Account> account, Scanner sc) {

		System.out.print("\nAccount Name : ");
		String name = sc.nextLine();

		System.out.print("\nInsert the password: ");
		int password = sc.nextInt();
		sc.nextLine();

		System.out.print("\nMonthly income: ");
		double inCome = sc.nextDouble();
		sc.nextLine();

		System.out.print("\nIs there a initial deposit? (y/n)");
		char response = sc.next().charAt(0);
		double inDep;
		if (response == 'y') {
			System.out.print("\nEnter your initial deposit: ");
			inDep = sc.nextDouble();

		} else {
			inDep = 0.0;
		}
		Account aux = new Account(name, password, inDep, inCome);
		account.add(aux);

		System.out.println("\nAccount Id: " + aux.getId());
	}

	public static Account find_account(ArrayList<Account> account, int ID) {
		for (Account acc : account) {
			if (acc.getId() == ID) {
				return acc;
			}
		}
		return null;
	}

	public static void printAccount(Account account, Scanner sc) {

		System.out.println("\nAccount Data:");
		System.out.print(account.toString());

	}

	public static void login(ArrayList<Account> account, Scanner sc) {

		int operation;
		Account acc;
		
		System.out.print("\nAccount ID: ");
		int accountId = sc.nextInt(); 
		acc = find_account(account, accountId);  
		if (acc == null) {
			System.out.print("\nAccount not found.");
			return;
		}

		System.out.print("Password: ");
		int password = sc.nextInt();
		if (acc.checkPassword(password) == true) {
			do {
				System.out.println("\n	Account accessed");
				System.out.println("1.BALANCE");
				System.out.println("2.DEPOSIT");
				System.out.println("3.WITHDRAW");
				System.out.println("4.DELETE ACCOUNT");
				System.out.println("5.LEAVE");
				System.out.print("Which operation? ");
				operation = sc.nextInt();

				switch (operation) {
				case 1:
					printAccount(acc, sc);
					break;
				case 2:
					Deposit(acc, sc);
					break;
				case 3:
					Withdraw(acc, sc);
					break;
				case 4:
					DeleteAccount(account, acc, sc);
					break;
				case 5:
					System.out.println("\nGoing to Main Menu");
					break;
				default:
					System.out.println("\nInvalid Operation");
					break;
				}
			} while (operation != 5);
		} else {
			System.out.print("\nWRONG LOGIN!\n");
		}
	}

	public static void Deposit(Account account, Scanner sc) {
		System.out.print("\nEnter deposit value: ");
		account.Deposit(sc.nextDouble());

	}

	public static void Withdraw(Account account, Scanner sc) {
		System.out.print("\nEnter de withdraw value: ");
		account.Withdraw(sc.nextDouble());

	}

	public static void DeleteAccount(ArrayList<Account> account, Account acc, Scanner sc) {
		System.out.print("\nDo you really wanna delete this account? (y/n)");
		sc.nextLine();
		if (sc.nextLine().charAt(0) == 'y') {
			account.remove(acc);
		} else {
			System.out.print("\nAccount not deleted!");
			return;
		}
	}
}
