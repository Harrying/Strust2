package com.lxb.db;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * 数据库的连接配置
 * @author bing
 *
 */
public class DBConn {
	
	static String DBDriver = null;
	static String DBUrl = null;
	static String DBRoot = null;
	static String DBPass = null;
	
	// 创建连接
	Connection  conn = null;
	
	static{
		try {
			// 实例化文件
			Properties properties = new Properties();
			// 加载配置文件
			InputStream is = DBConn.class.getClassLoader().getResourceAsStream("db.properties");
			properties.load(is);
			// 从properties文件中获取数据库配置文件
			DBDriver = properties.getProperty("DBDriver");
			DBUrl = properties.getProperty("DBUrl");
			DBRoot = properties.getProperty("DBRoot");
			DBPass = properties.getProperty("DBPass");
			System.out.println("加载数据库...");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 获取数据库的连接
	 * @return
	 */
	public Connection getConn(){
		try {
			Class.forName(DBDriver);
			conn = DriverManager.getConnection(DBUrl, DBRoot, DBPass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
