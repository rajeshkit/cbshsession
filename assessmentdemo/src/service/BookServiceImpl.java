package service;

import dao.BookDao;
import entity.Book;
import exception.BookIdNotFoundException;
import exception.NoBookAvailable;

public class BookServiceImpl implements BookService {
	public BookDao bookDao;
	
	public BookServiceImpl(BookDao bookDao) {
		super();
		this.bookDao = bookDao;
	}

	@Override
	public void addBook(Book book) {
		bookDao.registerBook(book);
	}

	@Override
	public Book getByBookId(Integer bookId) throws BookIdNotFoundException{
		Book b1=null;
		try {
			b1 = bookDao.findByBookId(bookId);
		} catch (NoBookAvailable e) {
			throw new BookIdNotFoundException("Book with id you are looking for not found");
		}
		return b1;
	}

}
