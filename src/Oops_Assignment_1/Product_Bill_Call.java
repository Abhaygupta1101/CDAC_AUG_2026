package Oops_Assignment_1;
import java.util.*;
public class Product_Bill_Call {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product Id : ");
		int ide1 = sc.nextInt();
		
		System.out.println("Enter Product Name : ");
		String productName1 = sc.next();
		
		System.out.println("Enter Product Price : ");
		double price1 = sc.nextDouble();
		
		System.out.print("Enter product quantity : ");
		int quantity1 = sc.nextInt();
		
		 Product_Bill p1 = new  Product_Bill(ide1,productName1,price1,quantity1);
		 
		 System.out.print("Enter product Id : ");
			int ide2 = sc.nextInt();
			
			System.out.println("Enter Product Name : ");
			String productName2 = sc.next();
			
			System.out.println("Enter Product Price : ");
			double price2 = sc.nextDouble();
			
			System.out.println("Enter product quantity : ");
			int quantity2 = sc.nextInt();
			
			 Product_Bill p2 = new  Product_Bill(ide2,productName2,price2,quantity2);
		 
		 
			 System.out.println("Enter product Id : ");
				int ide3 = sc.nextInt();
				
				System.out.println("Enter Product Name : ");
				String productName3 = sc.next();
				
				System.out.println("Enter Product Price : ");
				double price3 = sc.nextDouble();
				
				System.out.println("Enter product quantity : ");
				int quantity3 = sc.nextInt();
				
				 Product_Bill p3 = new  Product_Bill(ide3,productName3,price3,quantity3);
				 
				 System.out.println("This is your product bill");
				 
				 p1.display();
				 p2.display();
				 p3.display();
				 p1.calculateBill();
				 p2.calculateBill();
				 p3.calculateBill();
				 
				 }
}
		
