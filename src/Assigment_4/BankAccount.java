package Assigment_4;

public class BankAccount {

	int accountNo;
	String customerName;
	double balance;
	
	BankAccount(int accountNo, String customerName, double balance) {
		this.accountNo = accountNo;
		this.customerName = customerName; 
		this.balance = balance;
	}
	void display() { 
		System.out.println("Account No : " + accountNo); 
		System.out.println("Name : " + customerName); 
	System.out.println("Balance : " + balance);
	}
	void checkBalance() { 
		System.out.println("Current Balance : " + balance);
	}
	void calculateInterest() { 
		double interest;
		if (balance >= 100000) {
			interest = balance * 7 / 100;
			} else if (balance >= 50000) {
				interest = balance * 6 / 100;
				} else {
					interest = balance * 5 / 100;
				}
		System.out.println("Interest : " + interest);
		System.out.println();
	}

}
	
	

