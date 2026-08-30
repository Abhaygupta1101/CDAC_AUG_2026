package Assignment_3;
import java.util.*;
public class SumOfDigtis {

	public static int SumOfDi(int num) {
		int sum =0;
		while(num !=0) {
			int digit = num%10;
			sum = sum+digit;
			num=num/10;
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digits : ");
		int num = sc.nextInt();
		int sum = SumOfDi(num);
		System.out.println("Sum Of digits : " + sum) ;
	}
}
