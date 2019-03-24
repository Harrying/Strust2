package nuc.bean;

import java.util.ArrayList;
import java.util.List;

public class BookService {
	private List<Book> booklist=new ArrayList<Book>();

	public List<Book> getBooklist() {
		return booklist;
	}

	public void setBooklist(List<Book> booklist) {
		this.booklist = booklist;
	}
	public String addBook(Book book){
		booklist.add(book);
		return "success";
	}
	

}
