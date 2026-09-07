package Oops_Assi_Inheritance;

import java.util.*;

class BankAccount {

    long accountNo;
    String CustomerName;
    long balance;

    static String bankName = "SBI";

    BankAccount(long accountNo, String CustomerName, long balance) {
        this.accountNo = accountNo;
        this.CustomerName = CustomerName;
        this.balance = balance;
    }

    void display() {
        System.out.println("Bank Account Number : " + accountNo);
        System.out.println("Customer Name : " + CustomerName);
        System.out.println("Bank Balance : " + balance);
        System.out.println("Bank Name : " + bankName);
    }
}

class SavingsAccount extends BankAccount {

    double interestRate;

    SavingsAccount(double interestRate, long accountNo,
                   String CustomerName, long balance) {

        super(accountNo, CustomerName, balance);

        this.interestRate = interestRate;
    }

    void calculateIntrest() {

        double interest = (balance * interestRate) / 100;

        
        System.out.println("Interest Amount : " + interest);
    }

    void display() {

        super.display();

        System.out.println("Interest Rate : " + interestRate + "%");
    }
}

class CurrentAccount extends BankAccount {

    long minimumBalance = 20000;

    CurrentAccount(long minimumBalance, long accountNo,
                   String CustomerName, long balance) {

        super(accountNo, CustomerName, balance);

        this.minimumBalance = minimumBalance;
    }

    void checkMinimumBalance() {

        if (balance >= minimumBalance) {
            System.out.println("Account is maintaining minimum balance");
        } else {
            System.out.println("Account is not maintaining minimum balance");
        }
    }

    void display() {

        super.display();

        System.out.println("Minimum Balance : " + minimumBalance);
    }
}

public class BankAccout {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the details");

        System.out.print("Enter Account Number : ");
        long accNo = sc.nextLong();

        sc.nextLine(); 

        System.out.print("Enter Customer Name : ");
        String customerName = sc.nextLine();

        System.out.print("Enter Balance : ");
        long balance = sc.nextLong();

        System.out.print("Enter Interest Rate : ");
        double interestRate = sc.nextDouble();

        System.out.print("Enter Minimum Balance : ");
        long minimumBalance = sc.nextLong();

        SavingsAccount savings = new SavingsAccount(interestRate,accNo,customerName,balance);

        System.out.println("Savings Account ");

        savings.display();
        savings.calculateIntrest();

        CurrentAccount current =new CurrentAccount(minimumBalance,accNo,customerName,balance);

        System.out.println("Current Account ");

        current.display();
        current.checkMinimumBalance();

   
    }
}
   

