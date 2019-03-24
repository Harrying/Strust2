package com.lxb.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lxb.dao.BookDao;
import com.lxb.db.DBConn;
import com.lxb.eneity.Book;

public class BookDaoImpl implements BookDao{

	
	/**
	 * 删除书籍
	 */
	@Override
	public boolean deleteBook(Book b) {
		boolean flag = false;
		DBConn jdbc = new DBConn();
		Connection conn = jdbc.getConn();
		try {
			String sql = "delete from books where bookName = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, b.getBookName());
			int update = ps.executeUpdate();
			if(update>0){
				flag = true;
				System.out.println("删除成功..");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean updateBook(int id,Book b) {
		boolean flag = false;
		DBConn jdbc = new DBConn();
		Connection conn = jdbc.getConn();
		try {
			String sql = "update books set bookName=?,bookAuthor=?,bookPublish=?,bookPrice=?  where id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, b.getBookName());
			ps.setString(2, b.getBookAuthor());
			ps.setString(3, b.getBookPublish());
			ps.setFloat(4, b.getBookPrice());
			ps.setInt(5, id);
			int rs = ps.executeUpdate();
			if(rs>0){
				flag = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	/**
	 * 浏览所有书籍
	 */
	@Override
	public List<Book> selectBook() {
		DBConn jdbc = new DBConn();
		Connection conn = jdbc.getConn();
		List<Book> list = new ArrayList<Book>();
		try {
			String sql = "select bookName,bookAuthor,bookPublish,bookPrice from books";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Book b = new Book();
				b.setBookName(rs.getString("bookName"));
				b.setBookAuthor(rs.getString("bookAuthor"));
				b.setBookPublish(rs.getString("bookPublish"));
				b.setBookPrice(rs.getFloat("bookPrice"));
				list.add(b);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("查询成功...");
		return list;
	}
	/**
	 * 添加书籍
	 */
	@Override
	public boolean addBook(Book b) {
		DBConn jdbc = new DBConn();
		Connection conn = jdbc.getConn();
		boolean flag = false;
		try {
			String sql = "insert into books(bookName,bookAuthor,bookPublish,bookPrice) values(?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, b.getBookName());
			ps.setString(2, b.getBookAuthor());
			ps.setString(3, b.getBookPublish());
			ps.setFloat(4, b.getBookPrice());
			int re = ps.executeUpdate();
			if(re>0){
				flag = true;
				System.out.println("数据入库成功");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return flag;
	}
	/**
	 * 查询书籍
	 */
	@Override
	public List<Book> selectOneBook(Book b) {
		DBConn jdbc = new DBConn();
		Connection conn = jdbc.getConn();
		List<Book> list = new ArrayList<Book>();
		ResultSet rs = null;
		try {
			String sql ="select id,bookName,bookAuthor,bookPublish,bookPrice from books where  ";
			if("" == b.getBookName() || b.getBookName().equals("")){
				sql = sql+" 1=1";
				PreparedStatement ps = conn.prepareStatement(sql);
				rs = ps.executeQuery();
			}else{
				sql = sql+" bookName = ?";
				PreparedStatement ps1 = conn.prepareStatement(sql);
				ps1.setString(1, b.getBookName());
				rs = ps1.executeQuery();
			}
			while(rs.next()){
				Book book = new Book();
				book.setBookId(rs.getInt("id"));
				book.setBookName(rs.getString("bookName"));
				book.setBookAuthor(rs.getString("bookAuthor"));
				book.setBookPublish(rs.getString("bookPublish"));
				book.setBookPrice(rs.getFloat("bookPrice"));
				list.add(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("查询["+list.get(0)+"]成功...");
		return list;
	}

}
