package Assignment_3;

public class SimpleCalcuOerations{
	public static double calculator(double a, double b, char operator) {
		double result =0;
		switch(operator)	{    
		
		case '+': result = a + b;
        break;
        
		case '-' : result= a-b;
		break;
		case '*' : result= a*b;
		break;
		
		case '/' : result= a/b;
		break;
		
		case '%' : result= a%b;
		break;
		
		default: System.out.println("Invalid operator ");
		
		}
		
		return result;
	}

}
