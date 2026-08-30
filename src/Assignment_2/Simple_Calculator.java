package Assignment_2;
import java.util.*;
public class Simple_Calculator {
	public static double Calculater(double num1, double num2, char operatr) {
		if(operatr == '+')
			return num1 + num2;
		else if (operatr == '-')
			return num1 - num2;
		else if(operatr =='*')
			return num1 * num2;
		else if(operatr == '/') {
			if(num2 ==0) {
				System.out.println("Cannot divid by zero " );
		    
			return 0;
	}
		return num1 / num2;
	}
			else {
				System.out.println("Invalid operator");
		    return 0;
			}
}

	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value ");
		System.out.print("Enter the  first value : ");
		double num1 = sc.nextDouble();
		System.out.print("Enter the  second value : ");
	    double num2 =sc.nextDouble();	
	    System.out.println("Enter the operator '+', '-', '*','/' : ");
	    char operator = sc.next().charAt(0);
	    double result = Calculater(num1, num2, operator);
	    System.out.println("result " +result);
	}


	}


