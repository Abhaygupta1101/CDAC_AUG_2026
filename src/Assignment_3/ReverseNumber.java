package Assignment_3;
import java.util.*;
public class ReverseNumber {
	
	public static int ReverseNu(int num) {
		int reverse =0;
		while(num >0) {
			int digit = num %10;
			reverse = reverse *10+digit;
			num = num/10;
		}
		return reverse;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer ");
		 
		int num = sc.nextInt();
		int reverse = ReverseNu(num);
		System.out.println("Orignal number : " + num);
		System.out.println("Reverse Number : " + reverse  );
	}

}
