package entity;

public class Book {
	private Integer bookId;
	private String bookName;
	private Float bookCost;
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(Integer bookId, String bookName, Float bookCost) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookCost = bookCost;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Float getBookCost() {
		return bookCost;
	}
	public void setBookCost(Float bookCost) {
		this.bookCost = bookCost;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookCost=" + bookCost + "]";
	}
	
}
