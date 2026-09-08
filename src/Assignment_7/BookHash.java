package Assignment_7;

import java.util.Scanner;

public class BookHash {
	int bookId;
	String title;
	String author;
	double price;
	
	public BookHash() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the book details");
		System.out.println("Enter ID : ");
		this.bookId = sc.nextInt();
		System.out.println("Enter title : ");
		this.title = sc.next();
		System.out.println("Enter author name : ");
		this.author = sc.next();
		System.out.println("Enter price : ");
		this.price = sc.nextDouble();
		
	}
	void displayBookHash() {
		
		System.out.println("Book details");
		System.out.println("ID : "+bookId+" , Title : "+title+" , Auhtor : "+author+" , Price : "+price);
		
	}
	
}

