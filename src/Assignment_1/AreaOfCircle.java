package Assignment_1;
import java.util.*;
public class AreaOfCircle {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the value of radius : ");
	double radius = sc.nextInt();
	
	double area = 3.14*radius*radius;
	
	System.out.println("Area of circle : " + area);
	
	
	double circum= 2* 3.14*radius;
	
	
	System.out.println( "Circume of circle : "+circum);
}
}
