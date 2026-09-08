package Assignment_7;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class BookManagMentSystemHashMap {

	

		HashMap<Integer,BookHash> hm = new HashMap<>();
		Scanner sc  = new Scanner(System.in);
		
		public HashMap<Integer, BookHash> addBook() {
			
			BookHash b = new BookHash();
			hm.putIfAbsent(b.bookId, b);
			System.out.println("Book added");
			return hm;
			
		}
		
		public void displayAllBookHash() {
			
			for(Map.Entry<Integer, BookHash> m : hm.entrySet()) {
				
//				System.out.println(m.getKey());
				m.getValue().displayBookHash();
				
			}
			
		}
		
		public void SearchById() {
			
			System.out.println("Enter the book id :");
			int id = sc.nextInt();
			


			
			if(hm.containsKey(id)) {
				
				System.out.println("Book found");
			}
			
			else {
				
				System.out.println("Book not found");
			}
			
		}
		
		public void updateBook() {
			
			System.out.println("Enter Book id , title and price to update");
			int id = sc.nextInt();
			String title = sc.next();
			double price = sc.nextDouble();
			
			for(Map.Entry<Integer, BookHash> m : hm.entrySet()) {
				
				if(m.getKey()==id) {
					
					BookHash obj = m.getValue();
					obj.bookId=id;
					obj.title=title;
					obj.price=price;
					
				}
				
			}
			
		}
		
		public void deleteBook() {
			
			System.out.println("Enter Book id to delete");
			int id = sc.nextInt();
			
			if(hm.containsKey(id)) {
				
				hm.remove(id);
				System.out.println("Book with ID "+id+" is removed");
				
			}
			else {
				
				System.out.println("Book not found");
				
			}
			
			
		}

	}
