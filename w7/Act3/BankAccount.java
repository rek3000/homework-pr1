package w7.Act3;

public class BankAccount {
    double balance;
    int transactions;
    String name;
    static double fee = 0.5;
    
    public BankAccount(double initial, String name) {
        this.balance = initial;
        this.transactions = 1;
        this.name = name;
    }

    public void deposit(double amount) {
        balance += amount;
        transactions++;
    }

    public void withdraw(double amount) {
        balance -= amount;
        transactions++;
    }

    public void monthlyFee() {
        this.withdraw(10);
    }

    public void annualInterest(double interest) {
        balance += balance * interest;
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
