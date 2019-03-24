package nuc.sw.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserDetailsAction extends ActionSupport {

	private String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMobilephone() {
		return mobilephone;
	}
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private int age;
	private String mobilephone;
	private String email;
   @Override
public String execute() throws Exception {
	// TODO Auto-generated method stub
	return SUCCESS;
}
}
