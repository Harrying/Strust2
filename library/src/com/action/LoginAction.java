package com.lxb.action;

import com.lxb.dao.Login;
import com.lxb.dao.Impl.LoginImpl;
import com.lxb.eneity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport implements ModelDriven<User>{
	private int checknumber;
	private int rechecknumber;

	public int getChecknumber() {
		return checknumber;
	}
	public void setChecknumber(int checknumber) {
		this.checknumber = checknumber;
	}
	public int getRechecknumber() {
		return rechecknumber;
	}
	public void setRechecknumber(int rechecknumber) {
		this.rechecknumber = rechecknumber;
	}

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
	
	
	public String loginAction(){
		String str = null;
		Login login = new LoginImpl();
		
		if(login.loginUser(user)){
			ActionContext context = ActionContext.getContext();
			context.getSession().put("user", user);
			str = SUCCESS;
		}else{
			str = INPUT;
			this.addFieldError("error", "用户名或密码不正确！！");
		}
		return str;
	}
	
	
}
