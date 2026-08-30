package Assignment_2;
import java.util.*;
public class Emp_Salary {
	public static double calculateSalary(double sal){
		double final_Sal ;
		if(sal>=50000)
			final_Sal = sal+(sal*0.20);
		else 
			final_Sal =sal+(sal*0.10);
		return final_Sal;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salary : ");
			double salary = sc.nextDouble();
           double final_Sal = 		calculateSalary(salary);
           System.out.println("This is yaour final salary : " + final_Sal);
		}
	}

