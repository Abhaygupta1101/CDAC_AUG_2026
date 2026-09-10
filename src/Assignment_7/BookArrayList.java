
package Assignment_7;

import java.util.ArrayList;
import java.util.Scanner;


public class BookArrayList {

public static void main(String[] args) {
	
	
	Scanner sc = new Scanner(System.in);
	BookManagementArraylist bm = new BookManagementArraylist();
	ArrayList<Book> a;
	
	while(true) {
		
		System.out.println("1. Add Book");
		System.out.println("2. Display BooK");
		System.out.println("3. Search Book by ID");
		System.out.println("4. update Book");
		System.out.println("5. Delete Book");
		System.out.println("6. Exit");
		
		System.out.println("Enter your choice : ");
		int ch = sc.nextInt();
		
		switch(ch) {
		
		case 1 : a = bm.addBook();
		   break;
		

		case 2 : bm.displayAllBooks();
		   break;
		   

		case 3 : bm.searchById();
		   break;
		   

		case 4 : bm.updateBook();
		   break;
		   

		case 5 :  bm.DeleteBook();
		   break;
		   
		case 6 : System.out.println("Program End");
		     System.exit(0);
		     
		     default : System.out.println("Enter void choice");
		}
		
	}
}
}
		


