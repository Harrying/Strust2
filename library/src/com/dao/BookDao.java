package com.dao;

import java.util.List;

import com.lxb.eneity.Book;

public interface BookDao {
	// ����鼮
	public boolean addBook(Book b);
	// ɾ���鼮
	public boolean deleteBook(Book b);
	// �޸��鼮
	public boolean updateBook(int id,Book b);
	// ��ѯ�����鼮
	public List<Book> selectBook();
	// ��ѯһ���鼮
	public List<Book> selectOneBook(Book b);
}
