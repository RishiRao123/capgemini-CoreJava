package encapsulation;

class BankAccount {
	private String accountNumber;
	private String accountHoldername;
	private double balance;

	{
		balance = 0;
	}

	BankAccount(String accountNumber, String accountHolderName) {
		this.accountNumber = accountNumber;
		this.accountHoldername = accountHolderName;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		} else {
			System.out.println("Invalid deposit amount");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("Insufficient balance or invalid amount");
		}
	}

	public double getBalance() {
		return balance;
	}

}

public class Main2 {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount("SBI1002223456", "Rishi rao");
		b1.deposit(5000);
		b1.withdraw(2000);
		b1.withdraw(4000);
		System.out.println(b1.getBalance());
	}
}
