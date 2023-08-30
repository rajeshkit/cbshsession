package view;

import java.util.Scanner;

import dao.BookDao;
import entity.Book;
import exception.BookIdNotFoundException;
import service.BookServiceImpl;

public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String type = s.next();//set
		BookDao dao=BookFactory.getBookDaoObject(type);
		
		Book b1=new Book(454, "Python", 676.45f);
		BookServiceImpl bookService=new BookServiceImpl(dao);
		//bookService.addBook(b1);
		try {
			System.out.println(bookService.getByBookId(200));
		} catch (BookIdNotFoundException e) {
			
			System.out.println(e.getMessage());
		}
		s.close();
	}
}
