package Inheritance_Assignment_5;

 import java.util.*;  
class Employee1{
	int empId;
	String empName;
	double salary;
	static String  compnayName = "CDAC";
	Employee1(int empId, String name, double salary ){
     this.empId = empId;
     this.empName = empName;
     this.salary = salary;
     
	}
	
	void display() {
		System.out.println("Employee Id : " +empId); 
		System.out.println("Employee Name : " + empName);
		System.out.println("Employee salary : "+ salary);
		System.out.println("Compnay Name : "+ compnayName);
	}
}

class Manager extends Employee1 {
	String department;
	int teamSize;
	Manager(String department, int teamSize, int empId, String name, double salary){

		super( empId,  name, salary);
		this.department = department;
		this.teamSize = teamSize;
	}
	void dispaly() {
		super.display();
		System.out.println("Department Name : " + department);
		System.out.println("Team Size : " +teamSize);
		System.out.println("Anumal Salary " + salary * 12);
	}
}
       public class EmployeeOrManager {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the details");
        System.out.print("Enter employee Id : ");
        int empId = sc.nextInt();
        
        System.out.print("Enter employee Name : ");
        String name = sc.next();
        
        System.out.print("Enter employee salary : ");
        double salary = sc.nextDouble();
        
        System.out.print("Enter department  : ");
       String dep = sc.next();

       System.out.print("Ente teamSize : ");
       int teamSize= sc.nextInt();
       
       Manager m1 = new Manager(dep, teamSize, empId, name, salary);
       
       m1.display();
        
       }
	
}



