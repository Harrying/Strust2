package nuc.sw.action;

import nuc.sw.bean.User;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginRegistAction extends ActionSupport implements ModelDriven<User> {
    private User user=new User();
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	@Override
	public void validate() {
		// TODO Auto-generated method stub
		if(user.getUsername()==null||user.getUsername().trim().equals("")){
			this.addFieldError("username", "<font color='red'>用户名不能为空</font>");
		}
		else	if(user.getPassword()==null||user.getPassword().trim().equals("")){
			this.addFieldError("password", "<font color='red'>密码不能为空</font>");
		}
	}
	public void validateRegistMethod() {
		// TODO Auto-generated method stub
		if(user.getUsername()==null||user.getUsername().trim().equals("")){
			this.addFieldError("username", "<font color='yellow'>用户名不能为空</font>");
		}
		else	if(user.getPassword()==null||user.getPassword().trim().equals("")){
			this.addFieldError("password", "<font color='yellow'>密码不能为空</font>");
		}
	}
	public void validateLoginMethod() {
		// TODO Auto-generated method stub
		if(user.getUsername()==null||user.getUsername().trim().equals("")){
			this.addFieldError("username", "<font color='blue'>用户名不能为空</font>");
		}
		else	if(user.getPassword()==null||user.getPassword().trim().equals("")){
			this.addFieldError("password", "<font color='blue'>密码不能为空</font>");
		}
	}
	public String loginMethod(){
		if(user.getUsername().equals("王素红")&&user.getPassword().equals("123")&&user.getUsertype().equals("管理员")){
			ActionContext.getContext().getSession().put("user", user);
			return "adminSuccess";
		}
		else	if(user.getUsername().equals("乔雅宣")&&user.getPassword().equals("123456")&&user.getUsertype().equals("普通用户")){
			ActionContext.getContext().getSession().put("user", user);
			return "userSuccess";
		}
		else{
			this.addFieldError("error", "<font color='red'>用户名密码输入有误</font>");
		    return INPUT;
		}
	}
	public String registMethod(){
		ActionContext.getContext().getSession().put("user", user);
	     return SUCCESS;
	}
}
