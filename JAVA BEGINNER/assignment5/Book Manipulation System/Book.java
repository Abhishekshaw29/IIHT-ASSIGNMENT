
public class Book {
	
	private String bookTitle;
	private String bookPrice;
	private int yearOfPublication;
	private String authorName;
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(String bookPrice) {
		this.bookPrice = bookPrice;
	}
	public int getYearOfPublication() {
		return yearOfPublication;
	}
	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public Book(String bookTitle, String authorName, String bookPrice,  int yearOfPublication) {
		super();
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.bookPrice = bookPrice;
		this.yearOfPublication = yearOfPublication;
	}
	
	
}
