
package Oops_Assignment_1;

import java.util.*;

public class Student_Details_Call {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student_Details.student s1 = new Student_Details.student();
        Student_Details.student s2 = new Student_Details.student();
        Student_Details.student s3 = new Student_Details.student();
        
        
        System.out.println("Enter the details of student 1 ");
        
        System.out.println("Enter Roll No : ");
        s1.rollNo = sc.nextInt();
        
        System.out.println("Enter the name : ");
        s1.name= sc.next();
        
        System.out.println("Enter the marks : ");
        s1.marks = sc.nextInt();
        
        
        System.out.println("Enter the details of student 2 ");
        
        System.out.println("Enter Roll No : ");
        s2.rollNo = sc.nextInt();
        
        System.out.println("Enter the name : ");
        s2.name= sc.next();
        
        System.out.println("Enter the marks : ");
        s2.marks = sc.nextInt();

        System.out.println("Enter the details of student 3 ");
        
        System.out.println("Enter Roll No : ");
        s3.rollNo = sc.nextInt();
        
        System.out.println("Enter the name : ");
        s3.name= sc.next();
        
        System.out.println("Enter the marks : ");
        s3.marks = sc.nextInt();
        
        System.out.println("Student details");
        
        s1.display();
        s2.display();
        s3.display();
        
        
    }
}
