package dao;

import java.util.ArrayList;
import java.util.List;

import entity.Book;
import exception.NoBookAvailable;

public class BookDaoImpl1 implements BookDao{
	public static List<Book> bookList;
	static {
		bookList=new ArrayList<>();
		Book b1=new Book(123,"Java",788.0f);
		Book b2=new Book();
		b2.setBookId(200);
		b2.setBookName("c++");
		b2.setBookCost(567.5f);
		bookList.add(b2);
		bookList.add(b1);
	}
	@Override
	public void registerBook(Book book) {
		bookList.add(book);
	}

	@Override
	public Book findByBookId(Integer bookId) throws NoBookAvailable {
		Book b=null;
		for (Book book : bookList) {
			if(book.getBookId().equals(bookId)) {
				b=book;
				return b;
			}
		}
		if(b==null) {
			throw new NoBookAvailable();
		}
		return b;
	}

}
