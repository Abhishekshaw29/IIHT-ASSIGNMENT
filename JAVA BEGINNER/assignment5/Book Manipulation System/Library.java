import java.util.*;

public class Library {
	
	private ArrayList<Book> bookList = new ArrayList<Book>();

	public ArrayList<Book> getBookList() {
		return bookList;
	}

	public void setBookList(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}
	
	//to add a book
	public void addBook(Book bObj) {
		bookList.add(bObj);
	}
	
	//to state whether the list is empty or not
	public boolean isEmpty() {
		if(bookList.isEmpty())
			return true;
		else
			return false;
	}
	
	//to view all books
	public ArrayList<Book> viewAllBooks(){
		return bookList;
	}
	//to search by author name 
	public ArrayList<Book> searchByAuthor(String authorName){
		ArrayList<Book> arr = new ArrayList<Book>(); //to store the result
		Iterator itr = bookList.iterator();//calling iterator
		while(itr.hasNext()) { //to check next item in list
			Book b = (Book)itr.next(); //calling book object , type-casting to book object
			if(b.getAuthorName().equalsIgnoreCase(authorName))
				arr.add(b);
		}
		return arr;
	}
	
	//count the number of Book
	public int countNoOfBook(String bName) {
		int count = 0;
		Iterator itr = bookList.iterator();
		while(itr.hasNext()) { //to check next item in list
			Book b = (Book)itr.next(); //calling book object , type-casting to book object
			if(b.getBookTitle().equalsIgnoreCase(bName))
				count++;
		}
		
		return count;
	}
	
}
