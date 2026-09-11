package OOPs_Classes_ObjectsAssignment_4;
import java.util.*;
public class ElectricityBill2Call {
	public static void main(String[] args) {
	Scanner sc=  new Scanner(System.in);
	
	System.out.println("Enter the cousumer 1");
	
	System.out.println("Enter consumer Number : ");
	int no1 = sc.nextInt();
	
	System.out.println("Enter consumer Name : ");
	String name1 = sc.next();
	
	System.out.println("Enter units : ");
	int units1 = sc.nextInt();
	
	ElectricityBill2  e1 = new ElectricityBill2(no1,name1,units1 );
	
System.out.println("Enter the  cousumer 2");
	
	System.out.println("Enter consumer Number : ");
	int no2 = sc.nextInt();
	
	System.out.println("Enter consumer Name : ");
	String name2 = sc.next();
	
	System.out.println("Enter units : ");
	int units2 = sc.nextInt();
	
	ElectricityBill2  e2 = new ElectricityBill2(no2,name2,units2 );
	
   System.out.println("Enter the cousumer 3");
	
	System.out.println("Enter consumer Number : ");
	int no3 = sc.nextInt();
	
	System.out.println("Enter consumer Name : ");
	String name3 = sc.next();
	
	System.out.println("Enter units : ");
	int units3 = sc.nextInt();
	
	ElectricityBill2  e3 = new ElectricityBill2(no3,name3,units3 );
	
System.out.println("Enter the cousumer 4");
	
	System.out.println("Enter consumer Number : ");
	int no4 = sc.nextInt();
	
	System.out.println("Enter consumer Name : ");
	String name4 = sc.next();
	
	System.out.println("Enter units : ");
	int units4 = sc.nextInt();
	
	ElectricityBill2  e4 = new ElectricityBill2(no4,name4,units4 );
	
System.out.println("Enter the cousumer 5");
	
	System.out.println("Enter consumer Number : ");
	int no5 = sc.nextInt();
	
	System.out.println("Enter consumer Name : ");
	String name5 = sc.next();
	
	System.out.println("Enter units : ");
	int units5 = sc.nextInt();
	
	ElectricityBill2  e5 = new ElectricityBill2(no5,name5,units5 );
	
	e1.display();
	e1.calculateBill();
	
	e2.display();
	e2.calculateBill();
   
	e3.display();
	e3.calculateBill();
	
	e4.display();
	e4.calculateBill();
	
	e5.display();
	e5.calculateBill();
	}
}