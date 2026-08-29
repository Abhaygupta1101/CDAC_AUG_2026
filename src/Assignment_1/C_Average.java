package Assignment_1;
import java.util.*;
public class C_Average {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the 1st number : ");
	double a = sc.nextDouble();
	System.out.print("Enter the 2st number : ");
	double b = sc.nextDouble();
	System.out.print("Enter the 3st number : ");
	double c = sc.nextDouble();
	double total = a+b+c;
	System.out.println("Total : " + total);
	double ave = (a+b+c)/3;
			System.out.println("Average : "+ ave);
}
}
