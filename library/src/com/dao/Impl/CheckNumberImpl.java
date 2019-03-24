package com.lxb.dao.Impl;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.lxb.dao.CheckNumber;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

public class CheckNumberImpl implements CheckNumber{

	@Override
	public int check_number() {
		Random rand = new Random();
		int number = (rand.nextInt(9999)+1000);
		System.out.println(number);
		return number;
	}

}
