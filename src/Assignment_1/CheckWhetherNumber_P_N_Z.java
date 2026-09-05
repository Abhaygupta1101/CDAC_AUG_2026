package Assignment_1;
import java.util.*;
public class CheckWhetherNumber_P_N_Z {
	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		if(num>0)
			System.out.println("Number is positive "+num );
		else if(num<0)
			System.out.println("Number is Negative  "+num );
		else 
			System.out.println("Number is zero "+ num);
		
		}

}
