package Assignment_1;
import java.util.*;

public class VotingEligiblity {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter your age : ");
     int age = sc.nextInt();
     if(age>=18)
    	 System.out.println("Eligible for vote");
     else 
    	 System.out.println(" Not Eligible for vote");
}
}
