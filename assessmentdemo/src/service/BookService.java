package service;

import entity.Book;
import exception.BookIdNotFoundException;

public interface BookService {
	public void addBook(Book book);
	public Book getByBookId(Integer bookId) throws BookIdNotFoundException;
}
