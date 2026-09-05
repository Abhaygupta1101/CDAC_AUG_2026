package Assignment_2;
import java.util.*;
public class product_Discount {
  
	public static double Discount(double price) {
		double dis =0;
		if(price >=10000) {
			dis = price*0.20;
		}
		else if(price > 9999 && price <=5000) {
			dis = price*0.10;
		}
		else if(price >= 4999 && price <=2000) {
			dis = price*0.05;
		}
		else if(price<=2000) {
			System.out.println("No discount");
		}
		return  price - dis;
	}
	
	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details ");
		
	
		System.out.println("Enter the productId : " );
		int Id = sc.nextInt();
		
		System.out.println("Enter the product name : " );
		String name = sc.next();
		
		System.out.println("Enter the price  : " );
		double price = sc.nextDouble();
		
		
		double finalPrice = product_Discount.Discount(price);
		
		System.out.println("Product ID: " + Id);
		System.out.println("Product Name: " + name);
		System.out.println("Original Price: " + price);
		System.out.println("Final Price after Discount: " + finalPrice);
	}
	
}
