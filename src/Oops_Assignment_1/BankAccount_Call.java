package Oops_Assignment_1;
import java.util.*;
public class BankAccount_Call {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		// Bank Account 1
		System.out.println("Enter details of Account 1:");
		System.out.print("Enter Account No: ");
		int no1 = sc.nextInt(); 
		System.out.print("Enter Customer Name: ");
		String name1 = sc.next();
		System.out.print("Enter Balance: ");
		double balance1 = sc.nextDouble(); 
		BankAccount b1 = new BankAccount(no1, name1, balance1);
		
		System.out.println("Enter details of Account 2:");
		System.out.print("Enter Account No: ");
		int no2 = sc.nextInt(); 
		System.out.print("Enter Customer Name: ");
		String name2 = sc.next(); 
		System.out.print("Enter Balance: ");
		double balance2 = sc.nextDouble();
		BankAccount b2 = new BankAccount(no2, name2, balance2); 
		
		
		System.out.println("Enter details of Account 3:");
		System.out.print("Enter Account No: ");
		int no3 = sc.nextInt();
		System.out.print("Enter Customer Name: ");
		String name3 = sc.next();
		System.out.print("Enter Balance: ");
		double balance3 = sc.nextDouble(); 
		BankAccount b3 = new BankAccount(no3, name3, balance3); 
		
		
		System.out.println(" Account 1 ");
		b1.display(); 
		b1.checkBalance();
		b1.calculateInterest();
		// Display Account 2 
		System.out.println("Account 2 ");
		b2.display(); 
		b2.checkBalance();
		b2.calculateInterest();
		// Display Account 3 
		System.out.println("Account 3 "); 
		b3.display(); 
		b3.checkBalance(); 
		b3.calculateInterest();
		
}
}