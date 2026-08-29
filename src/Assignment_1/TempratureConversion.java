package Assignment_1;

import java.util.Scanner;

public class TempratureConversion {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the temperature in celsius : " );
	double celsius = sc.nextDouble();
	double Fahren = (celsius * 9/5)+32;
	System.out.println("This is your temp.. in Fahren. : " + Fahren);
	
}
}
