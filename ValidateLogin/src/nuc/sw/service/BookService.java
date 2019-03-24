package nuc.sw.service;

import java.util.ArrayList;
import java.util.List;

import nuc.sw.bean.Book;

public class BookService {
	private List<Book> bookList=new ArrayList<Book>();

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	public String addBook(Book book){
		bookList.add(book);
		return "success";
	}
	

}
