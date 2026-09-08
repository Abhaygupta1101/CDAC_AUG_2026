package Assignment_5;

import java.util.*;

class person {

    String name;
    int age;

    static String organization = "CDAC";

    person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Person Name : " + name);
        System.out.println("Person Age : " + age);
        System.out.println("Organization Name : " + organization);
    }
}

class Employee extends person {

    int empId;
    double salary;

    Employee(int empId, double salary, String name, int age) {

        super(name, age);

        this.empId = empId;
        this.salary = salary;
    }

    void display() {

        super.display();

        System.out.println("Employee Id : " + empId);
        System.out.println("Employee Salary : " + salary);
    }
}

class Manager2 extends Employee {

    String department;
    int teamSize;

    Manager2(String department, int teamSize,
             int empId, double salary, String name, int age) {

        super(empId, salary, name, age);

        this.department = department;
        this.teamSize = teamSize;
    }

    void display() {

        super.display();

        System.out.println("Department Name : " + department);
        System.out.println("Team Size : " + teamSize);
    }
}

public class Person_Emp_Manager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the details");

        System.out.print("Enter the Department Name : ");
        String dep = sc.next();

        System.out.print("Enter the Team Size : ");
        int teamS = sc.nextInt();

        System.out.print("Enter the Employee Id : ");
        int empID = sc.nextInt();

        System.out.print("Enter the Salary : ");
        double salaryy = sc.nextDouble();

        System.out.print("Enter the Person Name : ");
        String name = sc.next();

        System.out.print("Enter the Person Age : ");
        int age = sc.nextInt();

        Manager2 m1 = new Manager2( dep, teamS, empID, salaryy, name, age);

      

  


    }
}


