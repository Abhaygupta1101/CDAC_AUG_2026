package Assignment_2;
import java.util.*;
public class product_Discount {
  
	public static double Discount(double price) {
		double dis;
		if(price>=10000)
			dis = price*0.20;
		else if(price >=5000 && price <=9999)
			dis =price*0.10;
		else if(price >=2000 && price <=4999 )
			dis = price*0.05;
		else
			dis =0;
			return price - dis;
	}
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Product ID: ");
        String productId = sc.next();
        
        System.out.print("Enter Product Name: ");
        String productName = sc.next();

        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();
        double finalPrice = Discount(price);
		System.out.print("This is your final price :" + finalPrice);
		
	}
}
