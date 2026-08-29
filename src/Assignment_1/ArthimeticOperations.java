package Assignment_1;
import java.util.*;
public class ArthimeticOperations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value  a: ");
		int a = sc.nextInt();
		System.out.print("Enter the value b: ");
		int b = sc.nextInt();
        int add = a+b;
	   System.out.println(" sum Of a OR b : " + add);
	   int sub = a-b;
	   System.out.println(" sub Of a OR b : " + sub);
	   int mul = a*b;
	   System.out.println(" multiplation Of a OR b : " + mul);
	   int div = a/b;
	   System.out.println(" division Of a OR b : " + div);
	   int rem = a+b;
	   System.out.println(" remainder Of a OR b : " + rem);
	}

}
