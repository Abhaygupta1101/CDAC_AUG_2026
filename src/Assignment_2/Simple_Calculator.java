package Assignment_2;
import java.util.*;
public class Simple_Calculator {
  public static double calculate(double a, double b, char operator) {
	    double result =0;
	  
	  if(operator == '+') {
		  result = a+b;
	  }
	  
	  else if(operator == '-') {
		  result = a-b;
	  }
	  
	  else if(operator == '*') {
		  result = a*b;
	  }
	  
	  else if(operator == '/') {
		  result = a/b;
	  }
	  
	  else if(operator == '%') {
		  result = a%b;
	  }
	  else {
		  System.out.println("Operator is not valid ");
	  }
	  
	  
	  return result;
   	  
  }
  public static void main(String[] args ) {
	  Scanner sc =new Scanner(System.in);
	  
	   System.out.println("Enter the first number");
	   double a = sc.nextDouble();
	   
	   
	   System.out.println("Enter the second number");
	   double b = sc.nextDouble();
	   
	   
	   System.out.println("Enter the Operator (_+, _ *,%, /) ");
	  char ope = sc.next().charAt(0);
	   
	  double cc = calculate(a, b, ope);
	  System.out.println("result " + cc);
	  
  }
	
}