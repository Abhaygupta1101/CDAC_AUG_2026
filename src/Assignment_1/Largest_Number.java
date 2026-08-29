package Assignment_1;
import java.util.*;
public class Largest_Number {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	System.out.print("Enter the first number: ");
    int num1 = sc.nextInt();

    System.out.print("Enter the second number: ");
    int num2 = sc.nextInt();

    if (num1 > num2) {
        System.out.println("Larger number is: " + num1);
    } 
    else if (num2 > num1) {
        System.out.println("Larger number is: " + num2);
    } 
    else {
        System.out.println("Both numbers are equal.");
    }
}
}
