package Assignment_1;
import java.util.*;
public class ArthimeticOperations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		double a = sc.nextInt();
		System.out.println("Enter the Second Number : ");
		double b = sc.nextInt();
		
		double sum = a+b;
		System.out.println(" sum of the number : " + sum);
		
		double sub = a-b;
		System.out.println(" sub(-) of the number : " + sub);
		
		double multi = a+b;
		System.out.println(" multipliction of the number : " + multi);
		
		double division =a/b;
		System.out.println("division of numbers : " + division);
		
		double remainder =a%b;
		System.out.println("division of numbers : " + remainder);
		
		
		
		
	}

}
