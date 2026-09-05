package Assignment_2;
import java.util.*;
public class ElectricityBill {
  
	public static double CalculateBill(int units) {
      double bill;
      if(units<100) {
    	  bill = 2*units;
      }
      
      else if(units<=200) {
    	  bill = (100*2) + (units - 100) *3;
      }
      
      else if(units<=300) {
    	  bill = (100*2) + (100*3) + (units - 200)*5;
      }
      
      else {
    	  bill = (100*2) + (100*3) + (100*5) + (units - 300)*7;
      }
	  return bill;
      
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the units : ");
		int a = sc.nextInt();
		 
		double bb = ElectricityBill. CalculateBill(a);
	    System.out.println("This is your bill : " + bb);
		
	}
	
}
