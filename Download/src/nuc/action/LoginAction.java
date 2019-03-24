package nuc.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String username;
	private String password;
	private String usertype;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public String loginMethod(){
		if(username.equals("wsh")&&password.equals("123")){
			ActionContext.getContext().getSession().put("username", username);
			ActionContext.getContext().getSession().put("usertype", usertype);
			return "loginOK";
		}
		else{
			this.addFieldError("error", "<font color='red'>用户名与密码不匹配</font>");
			return "input";
		}
	}
	

}
