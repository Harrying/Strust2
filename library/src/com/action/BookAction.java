package com.lxb.action;

import java.util.List;

import com.lxb.dao.BookDao;
import com.lxb.dao.Impl.BookDaoImpl;
import com.lxb.eneity.Book;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

@SuppressWarnings({ "serial", "rawtypes" })
public class BookAction extends ActionSupport implements ModelDriven{
	private Book book = new Book();
	public static int id = 0;
	BookDao bookdao = new BookDaoImpl();
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public Book getModel() {
		// TODO Auto-generated method stub
		return book;
	}
	// ����鼮
	public String add_books(){
		String str = null;
		boolean flag = bookdao.addBook(book);
		if(flag){
			str = SUCCESS;
		}else{
			str = INPUT;
			this.addFieldError("error", "���ʧ��");
		}
		return str;
	}
	
	// ��ѯ�����鼮
	public String select_books(){
		String str = null;
		List<Book> list = bookdao.selectBook();
		if(null == list || list.size() == 0){
			str = INPUT;
			this.addFieldError("error1", "��ѯʧ��");
		}else{
			ValueStack stack = ActionContext.getContext().getValueStack();
			stack.set("list",list);
			str = SUCCESS;
		}
		return str;
	}
	// ��ѯһ����
	public String select_book(){
		String str = null;
		System.out.println("���ڲ�ѯ....");
		List<Book> list = bookdao.selectOneBook(book);
		if(list == null || list.size() == 0){
			str = INPUT;
			this.addFieldError("selectError", "û�в鵽���鼮");
		}else{
			ValueStack stack = ActionContext.getContext().getValueStack();
			stack.set("list", list);
			str = SUCCESS;
		}
		return str;
	}
	// ɾ���鼮
	public String delete_book(){
		String str = null;
		System.out.println("����ɾ��....");
		boolean flag = bookdao.deleteBook(bookdao.selectOneBook(book).get(0));
		if(flag){
			this.addFieldError("deleteSuccess", "ɾ���ɹ�");
			str = SUCCESS;
		}else{
			str = INPUT;
			this.addFieldError("deleteError", "ɾ��ʧ��");
		}
		return str;
	}
	// �޸��鼮
	public String update_book(){
		String str = null;
//		List<Book> list = bookdao.selectOneBook(book);
//		ActionContext.getContext().getValueStack().set("updatelist", list);
		boolean flag = bookdao.updateBook(id,book);
		if(flag){
			str = SUCCESS;
		}else{
			str = INPUT;
			this.addFieldError("updateError", "�޸�ʧ��");
		}
		return str;
	}
	// �޸Ĳ�ѯ
	public String update_select_book(){
		List<Book> list = bookdao.selectOneBook(book);
		ActionContext.getContext().getValueStack().set("updatelist", list);
		id = list.get(0).getBookId();
		return SUCCESS;
	}
}
