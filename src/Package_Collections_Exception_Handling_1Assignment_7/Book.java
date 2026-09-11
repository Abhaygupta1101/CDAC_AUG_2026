
package Package_Collections_Exception_Handling_1Assignment_7;


import java.util.*;

public class Book {

	int bookId;
	String title;
	String author;
	double price;
	
	public Book() {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter book details");
		
		System.out.println("Enter Book ID : ");
		this.bookId = sc.nextInt();
		System.out.println("Enter Book Title : ");
		this.title = sc.next();
		System.out.println("Enter author name : ");
		this.author = sc.next();
		System.out.println("Enter the price : ");
		this.price = sc.nextDouble();
		
	}
	
	
	public void display() {
		
		System.out.println("Book Details");
		System.out.println("ID : "+bookId+" , Title : "+title+" , Auhtor : "+author+" , Price : "+price);
		
	}
	
	
}
