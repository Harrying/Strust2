package nuc.sw.action;

import java.util.List;

import nuc.sw.bean.Book;
import nuc.sw.service.BookService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
public class BookAction extends ActionSupport {
  private	 Book book;
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
			ActionContext.getContext().getSession().put("bookService", bookService);
		}
	    bookService.addBook(book);
		
		System.out.println("添加图书成功");
		return SUCCESS;
	}
	public String deleteBook(){
		System.out.println("删除图书成功");
		return SUCCESS;
	}
	public String updateBook(){
		System.out.println("更新图书成功");
		return SUCCESS;
	}
	public String queryBook(){
		if(bookService==null){
			System.out.println("没有任何书籍存在");
			return "error";
		}
		else{
			List<Book> bookList=bookService.getBookList();
			for(int i=0;i<bookList.size();i++){
				System.out.print(bookList.get(i).getBookName()+"、");
				System.out.print(bookList.get(i).getBookAuthor()+"、"); 
				System.out.print(bookList.get(i).getBookPrice());
			}
			return "success";
		}
		
		
	}
   
	  
		   
	   }
   

