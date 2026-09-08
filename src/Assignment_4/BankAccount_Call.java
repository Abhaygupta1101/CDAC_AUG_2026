package Assignment_4;
import java.util.*;
public class BankAccount_Call {
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in) ;
	 
	System.out.println("Bank 1");
	
	
	System.out.print("Enter Account Number : ");
	int a1 = sc.nextInt();
	
	System.out.println("Enter customer Name : ");
	String n1 = sc.next();
	
	System.out.println("Enter the Balance :  ");
   double b1 = sc.nextDouble();
      
   BankAccount bb1 = new  BankAccount(a1,n1,b1);
   
   
   System.out.println("Bank 2");
	
	
	System.out.print("Enter Account Number : ");
	int a2 = sc.nextInt();
	
	System.out.println("Enter customer Name : ");
	String n2 = sc.next();
	
	System.out.println("Enter the Balance :  ");
    double b2 = sc.nextDouble();
     
    BankAccount bb2 = new  BankAccount(a2,n2,b2);
   
    System.out.println("Bank 3");
	
	
	System.out.print("Enter Account Number : ");
	int a3 = sc.nextInt();
	
	System.out.println("Enter customer Name : ");
	String n3 = sc.next();
	
	System.out.println("Enter the Balance :  ");
   double b3 = sc.nextDouble();
    
 BankAccount bb3 = new  BankAccount(a3,n3,b3);
 
 System.out.println("Account -----1");
    bb1.display(); 
	bb1.checkbalance();
	bb1.CalclateIntrest();
	
	System.out.println("Account -----2");
    bb2.display(); 
	bb2.checkbalance();
	bb2.CalclateIntrest();
	
	System.out.println("Account -----3");
    bb3.display(); 
	bb3.checkbalance();
	bb3.CalclateIntrest();
	}
	}
