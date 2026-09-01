package Assigment_4;
import java.util.*;
public class Product_Bill_Call {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Product ID: ");
		int id1 = sc.nextInt();
		
		System.out.print("Enter Product Name: "); 
		String name1 = sc.next(); 
		
		System.out.print("Enter Price: ");
		double price1 = sc.nextDouble();
		
		System.out.print("Enter Quantity: "); 
		int quantity1 = sc.nextInt();
		Product_Bill p1 = new Product_Bill(id1,name1,price1,quantity1);
		
		
		System.out.print("Enter Product ID 2: ");
		int id2 = sc.nextInt();
		
		System.out.print("Enter Product Name 2: "); 
		String name2 = sc.next(); 
		
		System.out.print("Enter Price: ");
		double price2 = sc.nextDouble();
		
		System.out.print("Enter Quantity: "); 
		int quantity2 = sc.nextInt();
		Product_Bill p2 = new Product_Bill(id2,name2,price2,quantity2);
		
		
		System.out.print("Enter Product ID 3: ");
		int id3 = sc.nextInt();
		
		System.out.print("Enter Product Name 3: "); 
		String name3 = sc.next(); 
		
		System.out.print("Enter Price: ");
		double price3 = sc.nextDouble();
		
		System.out.print("Enter Quantity: "); 
		int quantity3 = sc.nextInt();
		Product_Bill p3 = new Product_Bill(id3,name3,price3,quantity3);
		
		
		System.out.println("This is product bill");
		p1.display(); 
		p1.calc();
	}
}
