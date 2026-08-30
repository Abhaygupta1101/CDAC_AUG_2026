package Assignment_2;
import java.util.*;
public class LargestOfTwoNumber {

	public static int LargestNu(int num1, int num2) {
		if(num1>num2)
			return num1;
		else if(num1== num2)
			return num1;
		else
			
		return num2;
	}
	
	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number : " );
		int num1= sc.nextInt();
		System.out.print("Enter the Second Number : ");
		int num2= sc.nextInt();
		
        int large = LargestNu(num1,num2);
        System.out.println("This is the Largest Number " + large);
				
		
	}
}
