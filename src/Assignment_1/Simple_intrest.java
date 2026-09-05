package Assignment_1;
import java.util.*;
public class Simple_intrest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the detaile ");
	
	System.out.println("Enter the principal : ");
	double p = sc.nextDouble();
	
	System.out.println("Enter the rate of Intrest  : ");
	double r = sc.nextDouble();
	
	System.out.println("Enter the time : ");
	double t = sc.nextDouble();
	
	double simpleIntrest = (p*r*t)/100;
	System.out.println("Simple intrest : " + simpleIntrest);
	
	 double Amount = p + simpleIntrest;
	 System.out.println( "Amount  "+ Amount);
	
}
}
