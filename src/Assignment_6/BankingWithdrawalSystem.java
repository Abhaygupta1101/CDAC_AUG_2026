package Assignment_6;

import java.util.Scanner;

abstract class BankAccount {

    int accountNumber;
    String customerName;
    double balance;

    BankAccount(int accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

   
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited : " + amount);
    }

    // Abstract method
    abstract void calculateWithdrawalLimit();

    // Concrete method
    void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Balance : " + balance);
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(int accountNumber, String customerName, double balance) {
        super(accountNumber, customerName, balance);
    }

    @Override
    void calculateWithdrawalLimit() {

        double withdrawalLimit = balance * 80 / 100;

        System.out.println("Savings Account Withdrawal Limit : "
                + withdrawalLimit);
    }
}

class CurrentAccount extends BankAccount {

    double overdraftFacility;

    CurrentAccount(int accountNumber, String customerName,
                   double balance, double overdraftFacility) {

        super(accountNumber, customerName, balance);
        this.overdraftFacility = overdraftFacility;
    }

    @Override
    void calculateWithdrawalLimit() {

        double withdrawalLimit = balance + overdraftFacility;

        System.out.println("Current Account Withdrawal Limit : "
                + withdrawalLimit);
    }
}

public class BankingWithdrawalSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Savings Account
        System.out.println("Savings Account Details");
  

        System.out.print("Enter Account Number : ");
        int savingsAccountNo = sc.nextInt();

        System.out.print("Enter Customer Name : ");
        String savingsName = sc.next();

        System.out.print("Enter Balance : ");
        double savingsBalance = sc.nextDouble();

        SavingsAccount savings = new SavingsAccount(
                savingsAccountNo,
                savingsName,
                savingsBalance
        );

        System.out.print("Enter Deposit Amount : ");
        double savingsDeposit = sc.nextDouble();

        savings.deposit(savingsDeposit);

        savings.displayAccountDetails();
        savings.calculateWithdrawalLimit();


        // Current Account
        System.out.println("-------Current Account Details");
        

        System.out.print("Enter Account Number : ");
        int currentAccountNo = sc.nextInt();

        System.out.print("Enter Customer Name : ");
        String currentName = sc.next();

        System.out.print("Enter Balance : ");
        double currentBalance = sc.nextDouble();

        System.out.print("Enter Overdraft Facility : ");
        double overdraft = sc.nextDouble();

        CurrentAccount current = new CurrentAccount(
                currentAccountNo,
                currentName,
                currentBalance,
                overdraft
        );

        System.out.print("Enter Deposit Amount : ");
        double currentDeposit = sc.nextDouble();

        current.deposit(currentDeposit);

        current.displayAccountDetails();
        current.calculateWithdrawalLimit();


    }
}