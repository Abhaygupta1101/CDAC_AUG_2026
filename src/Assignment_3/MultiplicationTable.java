package Assignment_3;
import java.util.*;

public class MultiplicationTable {

	public static  int Table(int num) {
		for(int i =1; i<=10; i++) {
			System.out.println(num + " + " + i + " = " +(num*i));
			
		}
		return num;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  the number : ");
		int num = sc.nextInt();
		
		Table(num);
		
	}
}
