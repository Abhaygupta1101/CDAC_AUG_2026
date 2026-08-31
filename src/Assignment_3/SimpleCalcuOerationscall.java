package Assignment_3;
import java.util.*;
public class SimpleCalcuOerationscall {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	   
		System.out.println("Enter the first number : ");
	    double a = sc.nextDouble();
	    
	    System.out.println("Enter the Second number : ");
	    double b = sc.nextDouble();
	    
	    System.out.println("Enter the operator( + , - , * , / , % ) : ");
	    char operator  = sc.next().charAt(0);
	    
	    double result =SimpleCalcuOerations.calculator(a, b, operator);
	    System.out.println("Result = " + result);
	    
	}
}
