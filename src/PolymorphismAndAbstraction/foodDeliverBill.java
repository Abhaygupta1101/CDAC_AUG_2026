package PolymorphismAndAbstraction;
import java.util.*;
class FoodOrder{
	
	double calculateBill(double foodprice) {
	  return foodprice;
      
	}
	
	double calculateBill(double foodprice, int foodquantity) {
		 return foodprice * foodquantity;
	      
		}
	
	double calculateBill(double foodprice, int foodquantity,double deliveryCharge) {
		return (foodprice * foodquantity )+deliveryCharge;
	    
	      
		}
	
}


public class foodDeliverBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		FoodOrder order = new FoodOrder();
		
		System.out.print("Enter the food price for 1 item: ");
        double price1 = sc.nextDouble();

        double bill1 = order.calculateBill(price1);

        System.out.println("Bill for single item: " + bill1);
	   
	   
        System.out.println("Food Quantity ------------------");

        System.out.print("Enter the food price: ");
        double price2 = sc.nextDouble();

        System.out.print("Enter the food quantity: ");
        int quantity2 = sc.nextInt();

        double bill2 = order.calculateBill(price2, quantity2);

        System.out.println("Bill based on quantity:  " + bill2);
		
        
        System.out.println("Delivery Charge ------------------");

        System.out.print("Enter the food price: ");
        double price3 = sc.nextDouble();

        System.out.print("Enter the food quantity: ");
        int quantity3 = sc.nextInt();

        System.out.print("Enter the delivery charge: ");
        double deliveryCharge = sc.nextDouble();

        double bill3 = order.calculateBill(
                price3, quantity3, deliveryCharge);

        System.out.println("Final bill including delivery: ₹" + bill3);
	   
	}

}
