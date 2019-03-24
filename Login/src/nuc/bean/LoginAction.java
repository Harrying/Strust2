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
		this.addFieldError("username","<font color='red'>�û�������Ϊ��</font>");
	}
	else if(user.getPassword()==null||user.getPassword().trim().equals("")){
		this.addFieldError("password", "<font color='red'>���벻��Ϊ��</font>");
	}
}

public void validateLoginMethod() {
	// TODO Auto-generated method stub
	if(user.getUsername()==null||user.getUsername().trim().equals("")){
		this.addFieldError("username","<font color='blue'>�û�������Ϊ��</font>");
	}
	else if(user.getPassword()==null||user.getPassword().trim().equals("")){
		this.addFieldError("password", "<font color='blue'>���벻��Ϊ��</font>");
	}
}

public void validateRegistMethod() {
	// TODO Auto-generated method stub
	if(user.getUsername()==null||user.getUsername().trim().equals("")){
		this.addFieldError("username","<font color='green'>�û�������Ϊ��</font>");
	}
	else if(user.getPassword()==null||user.getPassword().trim().equals("")){
		this.addFieldError("password", "<font color='green'>���벻��Ϊ��</font>");
	}
}

public String LoginMethod(){
	if(user.getUsername().equals("��")&&user.getPassword().equals("123")&&user.getUsertype().equals("����Ա")){
		ActionContext.getContext().getSession().put("user", user);
		return "adminSuccess";
	}
	else if(user.getUsername().equals("��")&&user.getPassword().equals("456")&&user.getUsertype().equals("��ͨ�û�")){
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

