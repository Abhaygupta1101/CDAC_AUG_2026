package Assignment_3;
import java.util.*;
public class FindtheMaxOrMinCall {
 
	public static void main(String[] args) {
		Scanner  sc =new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		int n= sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter " + n + " elements :");
		for(int i=0; i<n ;i++) {
			arr[i] = sc.nextInt();
			
		}
		int[] result = FindtheMaxOrMin.findMaxMin(arr);
		System.out.println("Maximum = " + result[0]);
        System.out.println("Minimum = " + result[1]);
	}
}
