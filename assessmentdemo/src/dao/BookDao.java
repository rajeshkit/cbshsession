package dao;

import entity.Book;
import exception.NoBookAvailable;

public interface BookDao {
	public void registerBook(Book book);
	public Book findByBookId(Integer bookId) throws NoBookAvailable;

}
