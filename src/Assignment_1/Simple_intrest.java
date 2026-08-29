package Assignment_1;
import java.util.*;
public class Simple_intrest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System .out.print("Enter the principal : ");
	double p = sc.nextDouble();
	System .out.print("Enter the rate : ");
	double r = sc.nextDouble();
	System .out.print("Enter the time in year : ");
	double t = sc.nextDouble();
	double intrest = p * r*t;
	double Amount = p + intrest;
	System .out.println("This is your intrest : " + intrest);
	System .out.println(" This is your Amount : " + Amount );
	
}
}
