package live.tanujdevops;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.setBalance(1000);
		account.deposit(500);
		account.withdraw(200);
		account.deposit(-500);
		account.withdraw(-200);
		System.out.println("Balance = " + account.getBalance());
	}
}