package live.tanujdevops;

public class Main {
	public static void main(String[] args) {

		Account bobsAccount = new Account();

//		Account bobsAccount = new Account("12345", 500.0, "Bob Brown", "myemail@bob.com", "(087) 123-4567");

		System.out.println(bobsAccount.getNumber());
		System.out.println(bobsAccount.getBalance());

//		bobsAccount.setNumber("12345");
//		bobsAccount.setBalance(1000.00);
//		bobsAccount.setCustomerName("Bob Brown");
//		bobsAccount.setCustomerEmail("myemail@bob.com");
//		bobsAccount.setCustomerPhone("(087) 123-4567");

		bobsAccount.withdrawFunds(100.0);
		bobsAccount.depositFunds(250);
		bobsAccount.withdrawFunds(50);

		bobsAccount.withdrawFunds(200);

		bobsAccount.depositFunds(100);
		bobsAccount.withdrawFunds(45.55);
		bobsAccount.withdrawFunds(54.46);

		bobsAccount.withdrawFunds(54.45);

		Account timsAccount = new Account("Tim", "tim@email.com", "12345");
		System.out.println("AccountNo: " + timsAccount.getNumber() + "; name: " + timsAccount.getCustomerName());

//		customer test
		Customer tanuj = new Customer();
		System.out.println("Customer name: " + tanuj.getName() + "; credit limit: " + tanuj.getCreditLimit()
				+ "; email: " + tanuj.getEmail());

		Customer praveen = new Customer("Praveen", 5000.0, "praveen@email.com");
		System.out.println("Customer name: " + praveen.getName() + "; credit limit: " + praveen.getCreditLimit()
				+ "; email: " + praveen.getEmail());

		Customer anand = new Customer("Anand", "anand@email.com");
		System.out.println("Customer name: " + anand.getName() + "; credit limit: " + anand.getCreditLimit()
				+ "; email: " + anand.getEmail());
	}
}
