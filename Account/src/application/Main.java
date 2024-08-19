package application;

import entites.Account;
public class Main {

	public static void main(String[] args) {

			Account conta1 = new Account(01, "aaa", 75261.2, 2000.0);
			Account conta2 = new Account(02, "bbb", 27184.6, 1000.0);
			Account conta3 = new Account(03, "ccc", 2391.9, 500.0);
			
			System.out.println(conta1);
			System.out.println(conta2);
			System.out.println(conta3);

	}

}
