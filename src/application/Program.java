package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		
		System.out.print("Enter account number:  ");
		int numberc = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter account holder:  ");
		String holder = sc.nextLine ();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		//int option = sc.nextInt();
		
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.println();
			System.out.print("Enter initial deposit value:  ");
			double initialDeposit = sc.nextDouble();
			
			account = new Account (numberc, holder, initialDeposit);
			
		} 
		 else
				
			{
							
				account = new Account (numberc, holder);
				
			}		
		
		
			System.out.println(account.toString());
			
			System.out.println();
			
			System.out.print("Enter a deposit value:  ");
			
			double depositValue = sc.nextDouble();
			
			account.deposit(depositValue);
			System.out.println();
			System.out.println("Update account data: ");
			System.out.println(account.toString());
			
			
			System.out.println();
			
			System.out.print("Enter a withdraw value:   ");
			
			depositValue = sc.nextDouble();
			
			account.withdraw(depositValue);
			System.out.println();
			System.out.println("Update account data: ");
			System.out.println(account.toString());
			
		
		
			//System.out.println(account.getHolder);
		
		sc.close();

	}

}
