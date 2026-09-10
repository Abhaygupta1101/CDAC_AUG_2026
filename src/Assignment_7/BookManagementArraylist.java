
package Assignment_7;

import java.util.ArrayList;
import java.util.Scanner;



	import java.util.*;

	public class BookManagementArraylist  {
		
	
	
	Scanner sc =  new Scanner(System.in);
	ArrayList<Book> al = new ArrayList<>();
		public ArrayList<Book> addBooks(){
			Book b = new Book();
			return al;
		}
		
		
		public ArrayList<Book> addBook() {
			// TODO Auto-generated method stub
			Book b = new Book();
			al.add(b);
			System.out.println("Book is add");
			return al;
		}
		
		
		public void displayAllBooks() {
			// TODO Auto-generated method stub
			for(Book obj : al) {
				obj.display();
			}
			
		}
		
		public void searchById() {
			// TODO Auto-generated method stub
			System.out.println("Enter the Book Id to search");
			int id = sc.nextInt();
			int check =0;
			for(Book obj : al) {
				if(obj.bookId == id) {
					System.out.println("Book is found");
					check =1;
				}
			}
			if(check == 0) {
				System.out.println("Book is not found");
				
			}
		}
		
		
		public void updateBook() {
			// TODO Auto-generated method stub
			System.out.println("Enter Id, title ,price of book, ");
			int id = sc.nextInt();
			String title = sc.next();
			
			double price = sc.nextDouble();
			
			for(Book obj : al) {
				obj.bookId =id;
				obj.title = title;
				;
				obj.price = price;
				
			}
			System.out.println("Book details updated");
		}
	
		
		
		public void DeleteBook() {
		
		// TODO Auto-generated method stub

			System.out.println("Enter the Book Id to delete");
			int id = sc.hashCode();
			int count =0;
			for(Book obj :al) {
				 
				 if(obj.bookId == id) {
					 al.remove(count);
					 System.out.println("Book is deleted");
					 break;
				 }
				 count++;
			}
		}
		
	}


		
