package Assignment_3;
import java.util.*;
public class CountEvenOddCall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Enter the elements : ");
		 int n= sc.nextInt();
		 int[] arr = new int[n];
		 
		System.out.println("Enter the elements : ");
		for(int i=0; i<n ;i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] result = CountEvenOdd.countEvOd(arr);
	
	 System.out.println("Even number = " + result[0]);
	 System.out.println("Even number = " + result[1]);
	}
}
