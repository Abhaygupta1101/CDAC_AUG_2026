
package Package_Collections_Exception_Handling_1Assignment_7;

import java.util.Scanner;

public class Stack_Browser_History {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack_Browser_HistoryManagement sm =
                new Stack_Browser_HistoryManagement();

        while (true) {

            System.out.println("\n1. Visit New Page");
            System.out.println("2. Go Back");
            System.out.println("3. View Current Page");
            System.out.println("4. Display History");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");

            int ch = sc.nextInt();

            switch (ch) {

            case 1:
                sm.visitNewPage();
                break;

            case 2:
                sm.goBack();
                break;

            case 3:
                sm.viewCurrentPage();
                break;

            case 4:
                sm.displayHistory();
                break;

            case 5:
                System.out.println("Exiting from program...!");
                System.exit(0);

            default:
                System.out.println("Invalid choice!!");
            }
        }
    }
}

