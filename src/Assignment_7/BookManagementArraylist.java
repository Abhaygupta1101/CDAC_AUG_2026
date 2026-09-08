
package Assignment_7;

import java.util.ArrayList;
import java.util.Scanner;



	import java.util.*;

	public class BookManagementArraylist  {

		ArrayList<Book> al = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		public ArrayList<Book> addBooks() {
			
			Book b = new Book();
			al.add(b);
			System.out.println("Book is added");
			return al;
			
		}
		
		public void displayAllBooks() {
			
			for(Book obj : al) {
				
				obj.display();
				
			}
			
		}
		
		public void searchById() {
			
			System.out.println("Enter book ID to search");
			int id = sc.nextInt();
			int check=0;
			for(Book obj : al) {
				
				if(obj.bookId==id) {
					
					System.out.println("The Book is found");
					check=1;
					
				}
				
			}
			if(check==0) {
				
				System.out.println("Book is not found");
				
			}
			
		}
		
		public void updateBook() {
			
			System.out.println("Enter ID,title,price of book");
			int id = sc.nextInt();
			String title = sc.next();
			double price = sc.nextDouble();
			for(Book obj : al) {
				
				if(obj.bookId==id) {
					
					obj.bookId=id;
					obj.title=title;
					obj.price=price;
					
				}
				
			}
			System.out.println("Book details updated");
			
		}
		
		public void DeleteBook() {
			
			System.out.println("Enter the Book ID to delete");
			int id = sc.nextInt();
			int count=0;
			for(Book obj : al) {
				
				if(obj.bookId==id) {
					
					al.remove(count);
					System.out.println("Book is deleted");
					break;
					
				}
				count++;
				
				
			}
			
		}
		
}

