package Assignment_7;
import java.util.*;
public class Exception_Bank_Withdrawal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Queue<String> q;
		Exception_Handling_Bank_Withdrawal qm = new Exception_Handling_Bank_Withdrawal();
		
		while(true) {
			
			System.out.println("1. Add Patient");
			System.out.println("2. Treat Patient");
			System.out.println("3. View Next Patient");
			System.out.println("4. Display Waiting Patients");
			System.out.println("5. Exit");
			
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			
			switch(ch) {
			
			case 1 : q = qm.addPatient();
				     break;
			
			case 2 : qm.treatPatient();
					 break;
					 
			case 3 : qm.viewNextPatient();
					 break;
					 
			case 4 : qm.displayWaitingPatients();
					 break;
				   
			case 5 : System.out.println("Exiting from program...!");
					 System.exit(0);
					 
			default : System.out.println("Invalid choice!!");
			
			}
			
		}
		
	}
}
