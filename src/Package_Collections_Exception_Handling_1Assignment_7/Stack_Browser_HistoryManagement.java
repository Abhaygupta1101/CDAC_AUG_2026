
package Package_Collections_Exception_Handling_1Assignment_7;

import java.util.Scanner;
import java.util.Stack;

public class Stack_Browser_HistoryManagement {

    Scanner sc = new Scanner(System.in);

    Stack<String> s = new Stack<>();

    public void visitNewPage() {

        System.out.println("Enter new page you want to visit");

        String page = sc.next();

        s.push(page);

        System.out.println("New page is added");
    }

    public void goBack() {

        if (s.isEmpty()) {

            System.out.println("No pages to Go Back");

        } else {

            String page = s.pop();

            System.out.println("Going back from: " + page);

        }
    }

    public void viewCurrentPage() {

        if (s.isEmpty()) {

            System.out.println("No pages to view");

        } else {

            System.out.println("Current page is " + s.peek());
        }
    }

    public void displayHistory() {

        if (s.isEmpty()) {

            System.out.println("Browsing history is clear");

        } else {

            System.out.println("Browsing History---------");

            for (String page : s) {

                System.out.println(page);
            }
        }
    }
}
