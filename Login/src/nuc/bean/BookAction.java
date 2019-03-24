package nuc.bean;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class BookAction extends ActionSupport {
	private Book book;
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	private BookService bookService=(BookService)ActionContext.getContext().getSession().get("bookService");
	public BookService getBookService() {
		return bookService;
	}
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}
	public String addBook(){
		if(bookService==null){
		bookService=new BookService();
		}
		ActionContext.getContext().getSession().put("bookService", bookService);
		bookService.addBook(book);
		System.out.println("添加图书成功");
	    return  SUCCESS;
	}
	public String queryBook(){
		if(bookService==null){
			System.out.println("没有图书信息");
			return "error";
		}
		else{
			List<Book> booklist=bookService.getBooklist();
			for(int i=0;i<booklist.size();i++){
				System.out.println(booklist.get(i).getName()+"、");
				System.out.println(booklist.get(i).getAuthor()+"、");
				System.out.println(booklist.get(i).getPrice());
			}
			return "success";
		}
	}
}
