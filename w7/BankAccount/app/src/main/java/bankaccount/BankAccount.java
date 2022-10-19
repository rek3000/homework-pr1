package bankaccount;


public class BankAccount {
	double balance;
	int transactions;
	String name;
	static double fee = 0.5;

	public BankAccount (double initial, String name) {
		this.balance = initial;
		this.transactions = 1;
		this.name = name;
	}

	public void deposit(double amount) {
		balance += amount;
		transactions++;
	}

	public void withraw(double amount) {
		balance -= amount;
		transactions++;
	}

	public void monthlyFee() {
		this.withraw(10);	
	}

	public void addInterest(double interest) {
		balance += (balance*interest); 
		transactions++;
	}

	public String toString() {
		if (this.balance < 0) {
			return this.name + ", -$" + this.balance*(-1);
		} else {
			return this.name + ", $" + this.balance;
		}
	}

	public void transfer(BankAccount target, double amount) {
		if ((this.balance - (fee + amount)) < 0) {
			System.out.println("Not enough money!");
			return;
		}

		this.balance -= (amount + fee);
		target.balance += amount;
		this.transactions++;
	}

}
