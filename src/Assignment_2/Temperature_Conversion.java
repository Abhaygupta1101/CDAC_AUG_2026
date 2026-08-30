package Assignment_2;
import java.util.*;
public class Temperature_Conversion {
	 public static double Temp(double celsius) {
		 double fahren;
		 fahren = (celsius*9/5)+32;
		 if(fahren <100) {
			 fahren = (celsius*9/5)+32;
		 return fahren;
		 }
		 else {
			 System.out.println("Temperature is above 100F");
		 }
		 return fahren;
	 }
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the temperature in celsius :");
	double celsius = sc.nextDouble();
	double fahren = Temp(celsius);
	System.out.println(fahren);
}
}
