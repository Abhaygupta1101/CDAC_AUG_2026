package Assignment_7;
import java.util.*;
public class Exception_Handling_Bank_Withdrawal {
	Scanner sc = new Scanner(System.in);
	
	Queue<String> pq = new LinkedList<>();
	
	public Queue<String> addPatient() {
		
		System.out.println("Enter Patient name to add : ");
		String name = sc.next();
		pq.add(name);
		return pq;
		
	}

	public void treatPatient() {
		
		if(pq.isEmpty()) {
			
			System.out.println("No patients to treat");
			
		}
		else {
			
			String name = pq.poll();
			System.out.println("Treating patient "+name);
			
		}
	}

	public void viewNextPatient() {
		
		if(pq.isEmpty()) {
			
			System.out.println("No patients to view");
			
		}
		else {
			
			System.out.println("Next patient is "+pq.peek());
			
		}
		
	}

	public void displayWaitingPatients() {
		
		if(pq.isEmpty()) {
			
			System.out.println("No patients to display");
			
		}
		else {
			
			System.out.println("Waiting Patients details");
			for(String name : pq) {
				
				System.out.println(name);
				
			}
		
		}
	}
}
