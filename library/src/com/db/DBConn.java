package com.lxb.db;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * ���ݿ����������
 * @author bing
 *
 */
public class DBConn {
	
	static String DBDriver = null;
	static String DBUrl = null;
	static String DBRoot = null;
	static String DBPass = null;
	
	// ��������
	Connection  conn = null;
	
	static{
		try {
			// ʵ�����ļ�
			Properties properties = new Properties();
			// ���������ļ�
			InputStream is = DBConn.class.getClassLoader().getResourceAsStream("db.properties");
			properties.load(is);
			// ��properties�ļ��л�ȡ���ݿ������ļ�
			DBDriver = properties.getProperty("DBDriver");
			DBUrl = properties.getProperty("DBUrl");
			DBRoot = properties.getProperty("DBRoot");
			DBPass = properties.getProperty("DBPass");
			System.out.println("�������ݿ�...");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * ��ȡ���ݿ������
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
