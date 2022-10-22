package w7.Act3;

public class App {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(100, "Benson"); 	
	    BankAccount account2 = new BankAccount(20, "Jim"); 	
		System.out.println(account1.toString());
		System.out.println(account2.toString());

		account1.transfer(account2, 9.5);
		System.out.println(account1.toString());
		System.out.println(account2.toString());
    }
}
