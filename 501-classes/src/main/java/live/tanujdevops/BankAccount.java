package live.tanujdevops;

public class BankAccount {
	private long accountNo;
	private double balance;
	private String name;
	private String email;
	private String phone;

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void deposit(double amount) {
		if (amount < 0) {
			System.out.println("Negative " + amount + " cannot be deposited");
			return;
		}

		balance += amount;
		System.out.println("Deposited " + amount);
		System.out.println("Balance = " + balance);
	}

	public void withdraw(double amount) {
		if (amount < 0) {
			System.out.println("Negative " + amount + " cannot be withdrawn");
			return;
		}

		balance -= amount;
		System.out.println("Withdrew " + amount);
		System.out.println("Balance = " + balance);
	}
}
