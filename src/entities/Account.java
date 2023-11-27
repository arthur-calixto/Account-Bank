package entities;

public class Account {
	
	private int numberc;
	private String holder;
	private double balance;
	
	
	
	public Account(int numberc, String holder) {
		this.numberc = numberc;
		this.holder = holder;
	}


	public Account(int numberc, String holder, double initialDeposit) {
		this.numberc = numberc;
		this.holder = holder;
		deposit(initialDeposit);
	}


	public int getNumberc() {
		return numberc;
	}


	public String getHolder() {
		return holder;
	}


	public void setHolder(String holder) {
		this.holder = holder;
	}

	public void deposit (double amount) {
		this.balance += amount;
	}	
	
	public void withdraw (double amount) {
		this.balance -= amount + 5;
	}
	
	public String toString() {
		return "Account "+ numberc +", Holder : " + holder + " , Balance: $" + String.format("%.2f", balance);

	}
	

}
