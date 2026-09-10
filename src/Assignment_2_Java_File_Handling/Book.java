package Assignment_2_Java_File_Handling;

import java.io.Serializable;

public class Book implements Serializable{
   int BookId;
   String title;
   String auther;
double price;
   
   public Book(int i,String title,String auther,double price) {
	   this.BookId =i;
	   this.title =title;
	   this.auther = auther;
	   this.price =price;
   }
  
   void displayBook() {
	   System.out.println("BookId : " + BookId);
	   System.out.println("Title : "+ title);
	   System.out.println("auther : " + auther);
	   System.out.println("price : "+ price);
	   
   }
}
