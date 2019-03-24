package com.dao;

import java.util.List;

import com.lxb.eneity.Book;

public interface BookDao {
	// 添加书籍
	public boolean addBook(Book b);
	// 删除书籍
	public boolean deleteBook(Book b);
	// 修改书籍
	public boolean updateBook(int id,Book b);
	// 查询所有书籍
	public List<Book> selectBook();
	// 查询一本书籍
	public List<Book> selectOneBook(Book b);
}
