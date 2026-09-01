package Assigment_4;

public class Product_Bill {
   int productId;
   String productName;
   double price;
   int quantity;
   
   Product_Bill(int productId, String productName, double price, int quantity){
	this.productId =productId;
	this.productName =productName;
	this.price =price;
	this.quantity = quantity;
   }
   
   void display(){
	   System.out.println("Product ID : " + productId);
	   System.out.println("Product Name : " + productName); 
	   System.out.println("Price : ₹" + price); 
	   System.out.println("Quantity : " + quantity);
   }
   void calc() {
	   double total = price * quantity;
	   double discount;
	   if (total > 10000) {
		   discount = total * 10 / 100; 
		   } 
	   else {
		   discount = 0; 
		   } 
	   double finalAmount = total - discount;
	   System.out.println("Total Amount : ₹" + total);
	   System.out.println("Discount : ₹" + discount); 
	   System.out.println("Final Amount : ₹" + finalAmount);
   }
}
