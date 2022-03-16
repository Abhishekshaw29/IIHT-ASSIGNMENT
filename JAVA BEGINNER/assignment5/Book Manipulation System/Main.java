import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Library lib = new Library();
		
		int choice;
		
		while(true) {
			System.out.println("1. Add Book\n2. Display All Book\n3. Search By Author Name\n4. Count the number of Book - by Book Title\n5. Exit");
			System.out.println("Enter your choice");
			
			choice  = Integer.parseInt(sc.nextLine());
			
			if(choice == 1) {
				System.out.println("Enter Book Title");
				String title = sc.nextLine();
				System.out.println("Enter Author's Name");
				String author = sc.nextLine();
				System.out.println("Enter Book's Price");
				String price = sc.nextLine();
				System.out.println("Enter Year of Publication");
				int year = Integer.parseInt(sc.nextLine());
				Book b = new Book(title, author, price, year);
				lib.addBook(b);
				
				System.out.println("Congratulation!! New book added");
			}
			
			if(choice == 2) {
				ArrayList<Book> bookList = lib.viewAllBooks();
				
				if(bookList.isEmpty())
					System.out.println("Sorry No Book available");
				else {
					for(Book b:bookList)
						printer(b.getBookTitle(), b.getAuthorName(), b.getBookPrice(), b.getYearOfPublication());
				}
			}
			
			if(choice == 3) {
				System.out.println("Enter Author's Name");
				String name = sc.nextLine();
				ArrayList<Book> bList = lib.searchByAuthor(name);
				
				if(bList.isEmpty())
					System.out.println("No book found of this Author");
				else
					for(Book a:bList)
						printer(a.getBookTitle(), a.getBookPrice(), a.getYearOfPublication());
			}
			
			if(choice == 4) {
				System.out.println("Enter Book's Title");
				String title = sc.nextLine();
				System.out.println("Count: "+lib.countNoOfBook(title));
			}
			
			if(choice == 5)
				break;
		}
	}
	
	public static void printer(String bookTitle, String authorName, String bookPrice,  int yearOfPublication) {
		System.out.println("Title: "+bookTitle);
		System.out.println("Author: "+authorName);
		System.out.println("Price: "+bookPrice);
		System.out.println("Year of Publication: "+yearOfPublication);
	}
	
	public static void printer(String bookTitle, String bookPrice,  int yearOfPublication) {
		System.out.println("Title: "+bookTitle);
		System.out.println("Price: "+bookPrice);
		System.out.println("Year of Publication: "+yearOfPublication);
	}

}
