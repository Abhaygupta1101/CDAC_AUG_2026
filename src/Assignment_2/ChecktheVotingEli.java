package Assignment_2;
import java.util.*;
public class ChecktheVotingEli {
   public static boolean isEligible(int age) {
	   boolean aa ;
	   if(age>=18) {
		  aa = true;
	      System.out.println("You are eligible for ");
	   }else {
		   
	   
		   aa =false;
	      System.out.println("You are not eligible for ");
	   }
	   return aa;
   }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	   System.out.print("Enter the age : ");
	   int age = sc.nextInt();
	   boolean result = isEligible(age);
	   System.out.print(result);
	}
}
