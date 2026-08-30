package Assignment_2;
import java.util.*;
public class MobileDataUsage {
	public static double MobileData(int gb) {
		int price ;
		if(gb<=1)
			price = 50;
		else if(gb<=5)
			price =100;
		else if(gb<=10)
			price = 200;
		else
			price = 350;
		return price;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your mobile number: ");
		long mob = sc.nextLong();
		System.out.println("Enter your data in GB : ");
		int price = sc.nextInt();
		System.out.println("Final Charge : " +MobileData(price ) );
	}

}
