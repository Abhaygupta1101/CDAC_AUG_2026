
package Oops_Assignment_1;

import java.util.*;

public class Student_Details_Call {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        Student_Details.student s1 = new Student_Details.student();
        Student_Details.student s2 = new Student_Details.student();
        Student_Details.student s3 = new Student_Details.student();

       
        System.out.println("Enter details of Student 1:");

        System.out.print("Enter Roll No: ");
        s1.rollNo = sc.nextInt();

        System.out.print("Enter Name: ");
        s1.name = sc.next();

        System.out.print("Enter Marks: ");
        s1.marks = sc.nextInt();


       
        System.out.println("Enter details of Student 2:");

        System.out.print("Enter Roll No: ");
        s2.rollNo = sc.nextInt();

        System.out.print("Enter Name: ");
        s2.name = sc.next();

        System.out.print("Enter Marks: ");
        s2.marks = sc.nextInt();


        System.out.println("Enter details of Student 3:");

        System.out.print("Enter Roll No: ");
        s3.rollNo = sc.nextInt();

        System.out.print("Enter Name: ");
        s3.name = sc.next();

        System.out.print("Enter Marks: ");
        s3.marks = sc.nextInt();


        System.out.println(" Student Details ");

        s1.display();
        s2.display();
        s3.display();

    
    }
}
