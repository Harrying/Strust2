package com.lxb.action;

import com.lxb.dao.Register;
import com.lxb.dao.Impl.RegisterImpl;
import com.lxb.eneity.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("serial")
public class RegisterAction extends ActionSupport implements ModelDriven<User>{
	
	private User user = new User();
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	@Override
	public String execute() throws Exception {
		String str = null;
		Register rg = new RegisterImpl();
		if(rg.insertUser(user)){
			str = SUCCESS;
		}else{
			str = INPUT;
		}
		return str;
	}
	
}
