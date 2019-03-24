package nuc.bean;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<User> {
    User user=new User();
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
@Override
public void validate() {
	// TODO Auto-generated method stub
	if(user.getUsername()==null||user.getUsername().trim().equals("")){
		this.addFieldError("username","<font color='red'>用户名不能为空</font>");
	}
	else if(user.getPassword()==null||user.getPassword().trim().equals("")){
		this.addFieldError("password", "<font color='red'>密码不能为空</font>");
	}
}

public void validateLoginMethod() {
	// TODO Auto-generated method stub
	if(user.getUsername()==null||user.getUsername().trim().equals("")){
		this.addFieldError("username","<font color='blue'>用户名不能为空</font>");
	}
	else if(user.getPassword()==null||user.getPassword().trim().equals("")){
		this.addFieldError("password", "<font color='blue'>密码不能为空</font>");
	}
}

public void validateRegistMethod() {
	// TODO Auto-generated method stub
	if(user.getUsername()==null||user.getUsername().trim().equals("")){
		this.addFieldError("username","<font color='green'>用户名不能为空</font>");
	}
	else if(user.getPassword()==null||user.getPassword().trim().equals("")){
		this.addFieldError("password", "<font color='green'>密码不能为空</font>");
	}
}

public String LoginMethod(){
	if(user.getUsername().equals("王")&&user.getPassword().equals("123")&&user.getUsertype().equals("管理员")){
		ActionContext.getContext().getSession().put("user", user);
		return "adminSuccess";
	}
	else if(user.getUsername().equals("乔")&&user.getPassword().equals("456")&&user.getUsertype().equals("普通用户")){
		ActionContext.getContext().getSession().put("user", user);
		return "userSuccess";
	}
	else{
		return "input";
	}
		
	}
public String RegistMethod(){
	ActionContext.getContext().getSession().put("user", user);
	return SUCCESS;
}
}

