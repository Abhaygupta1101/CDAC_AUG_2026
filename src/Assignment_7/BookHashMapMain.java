package Assignment_7;
import java.util.*;
public class BookHashMapMain {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BookManagMentSystemHashMap bh = new BookManagMentSystemHashMap();
		HashMap<Integer,BookHash> h ;
		while(true) {
				
				System.out.println("1. Add Book");
				System.out.println("2. Display books");
				System.out.println("3. Search Book by ID");
				System.out.println("4. Update Book");
				System.out.println("5. Delete Book");
				System.out.println("6. Exit");
				
				System.out.println("Enter your choice : ");
				int ch = sc.nextInt();
				
				switch(ch) {
				
				case 1 : h = bh.addBook();
						 break;
						 
				case 2 : bh.displayAllBookHash();
						 break;
						
				case 3 : bh.SearchById();
						 break;
						 
				case 4 : bh.updateBook();
					     break;
					     
				case 5 : bh.deleteBook();
					 	 break;
					 	 
				case 6 : System.out.println("Program exiting....!");
						 System.exit(0);
				
				default : System.out.println("Enter valid choice");
				
				}
			
		}
		
	}
	
}
