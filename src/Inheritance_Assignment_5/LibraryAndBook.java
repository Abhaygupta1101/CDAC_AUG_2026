package Inheritance_Assignment_5;
import java.util.*;
class Book{
	int bookId;
	String title;
	String author;
	double price;
    
	Book(int bookId,String title,String author,double price){
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void displayBook() {
		System.out.println("Enter the Book Id : " + bookId);
		System.out.println("Enter the Book title : " + title);
		System.out.println("Enter the author name : " + price);
		System.out.println("Enter the price : "+ price);
	}
	
}

   

       class  Library{
	   String librayName;
	   String location;
	   Book book;
	   
	   static int totalBook =0;
        Library(String librayNameme,String location,Book book){
	      this.librayName =librayName;
	      this.location = location;
	      this.book = book;
	      totalBook ++;
	   }
        
		
		void display() {
        	System.out.println("librayName : "+ librayName);
        	System.out.println("Location : "+ location);
                }
   }
       
    public class LibraryAndBook {


    	public static void main(String[]args) {
    		Scanner sc = new Scanner(System.in);
    		
    		
    		System.out.println("Enter Library 1 Details : ");
            System.out.print("Library Name : ");
            String name1 = sc.next();
            
            System.out.print("Location : ");
            String location1 = sc.next();
            
            System.out.print("Book ID : ");
            int id1 = sc.nextInt();
    		
            System.out.print("Book Title : ");
            String title1 = sc.next();
            
            System.out.print("Author : ");
            String author1 = sc.next();

            System.out.print("Price: ");
            double price1 = sc.nextDouble();
            
            Book b1 = new Book(id1, title1, author1, price1);
            Library l1 = new Library(name1, location1, b1);
            
            
            System.out.println("Enter Library 2 Details : ");
            System.out.print("Library Name : ");
            String name2 = sc.next();
            
            System.out.print("Location : ");
            String location2 = sc.next();
            
            System.out.print("Book ID : ");
            int id2 = sc.nextInt();
    		
            System.out.print("Book Title : ");
            String title2 = sc.next();
            
            System.out.print("Author : ");
            String author2 = sc.next();

            System.out.print("Price: ");
            double price2 = sc.nextDouble();
            
            Book b2 = new Book(id2, title2, author2, price2);
            Library l2 = new Library(name2, location2, b2);
            
            System.out.println("Enter Library 3 Details : ");
            System.out.print("Library Name : ");
            String name3 = sc.next();
            
            System.out.print("Location : ");
            String location3 = sc.next();
            
            System.out.print("Book ID : ");
            int id3 = sc.nextInt();
    		
            System.out.print("Book Title : ");
            String title3 = sc.next();
            
            System.out.print("Author : ");
            String author3 = sc.next();

            System.out.print("Price: ");
            double price3 = sc.nextDouble();
            
            Book b3 = new Book(id3, title3, author3, price3);
            Library l3 = new Library(name3, location3, b3);
            
            l1.display();
            l2.display();
            l3.display();
            
            System.out.println("Total Books : "+  Library.totalBook);
            
    	}
}
