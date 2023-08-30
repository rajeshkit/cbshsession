package view;

import dao.BookDao;
import dao.BookDaoImpl1;
import dao.BookDaoImpl2;

public class BookFactory {
	public static BookDao getBookDaoObject(String type) {
		BookDao bookDao=null;
		if("list".equalsIgnoreCase(type)) {
			bookDao= new BookDaoImpl1();
		}
		if("set".equalsIgnoreCase(type)) {
			bookDao=new BookDaoImpl2();
		}
		return bookDao;
	}
}
