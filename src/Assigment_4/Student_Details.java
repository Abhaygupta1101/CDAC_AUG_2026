
package Assigment_4;

public class Student_Details {

    static class student {

        int rollNo;
        String name;
        int marks;

        void calculateGrade() {

            if (marks >= 90) {
                System.out.println("Grade A");
            }
            else if (marks >= 75) {
                System.out.println("Grade B");
            }
            else if (marks >= 60) {
                System.out.println("Grade C");
            }
            else {
                System.out.println("Grade D");
            }
        }

        void display() {

            System.out.println("RollNo : " + rollNo);
            System.out.println("Name : " + name);
            System.out.println("Marks : " + marks);

            calculateGrade();

            System.out.println();
        }
    }
}
