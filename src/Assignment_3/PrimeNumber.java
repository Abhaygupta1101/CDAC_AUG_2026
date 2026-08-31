package Assignment_3;
import java.util.*;
public class PrimeNumber {

	public static String findPrimes(int n) {
		String count="";
		for(int i =2;i<=n; i++) {
			boolean prime=true;
			for(int j=2; j<=i/2;j++) {
				if(i%j==0) {
					prime =false;
					break;
				}
			}
			if(prime) {
				count =count + i +" ";
			}
		}
		return count;
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
	String result = findPrimes(n);
		System.out.println("Number of prime numbers = " + result);

		
	}
}
