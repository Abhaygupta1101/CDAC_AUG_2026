package Oops_Assi_Inheritance;

    

class Employee1 {

    int empId;
    String name;
    double salary;

    static String companyName = "CADC";

    Employee1(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee Id " + empId);
        System.out.println("Employee name " + name);
        System.out.println("Employee salary " + salary);
        System.out.println("Company name " + companyName);
    }
}

class Manager1 extends Employee1 {

    String department;
    int teamSize;

    Manager1(String department, int teamSize,
             int empId, String name, double salary) {

        super(empId, name, salary);

        this.department = department;
        this.teamSize = teamSize;
    }

    void display() {

        super.display();

        System.out.println("Department name " + department);
        System.out.println("Team Size " + teamSize);
        System.out.println("Annual salary " + salary * 12);
    }
}
public class EmployeeOrManager {
	 public static void main(String[] args) {
		 System.out.println("Enter the details : ");
		 Manager1 m1 = new  Manager1("Ac",5,101,"Abhay", 10000);
		 m1.display();
	 }

	
}
