package com.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lxb.dao.Login;
import com.lxb.db.DBConn;
import com.lxb.eneity.User;

public class LoginImpl implements Login{

	@Override
	public boolean loginUser(User user) {
		boolean flag = false;
		try {
			DBConn jdbc = new DBConn();
			Connection conn = jdbc.getConn();
			String login_sql = "select username from user where username = ? and password = ?";
			PreparedStatement ps = conn.prepareStatement(login_sql);
			ps.setString(1,user.getUsername());
			ps.setString(2, user.getPassword());
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

}
