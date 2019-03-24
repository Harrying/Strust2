package com.lxb.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;


import com.lxb.dao.Register;
import com.lxb.db.DBConn;
import com.lxb.eneity.User;

public class RegisterImpl implements Register {

	@Override
	public boolean insertUser(User user) {
		
		boolean flag = false;
		try {
			DBConn dbconn = new DBConn();
			System.out.println("11");
			Connection jdbc = dbconn.getConn();
			System.out.println("2");
			String sql = "insert into user(username,password,age,phone,birthday) value(?,?,?,?,?)";
			PreparedStatement ps = jdbc.prepareStatement(sql);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setInt(3, user.getAge());
			ps.setString(4, user.getPhone());
			ps.setDate(5,user.getBirthday());
			int rs = ps.executeUpdate();
			if(rs>0){
				flag = true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(user+"re");
		return flag;
	}

}
