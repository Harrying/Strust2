package nuc.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class UsertypeInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		ActionContext actionContext=invocation.getInvocationContext();
		String usertype=(String)actionContext.getContext().getSession().get("usertype");
	    if(usertype!=null&&usertype.equals("管理员")){
	    	return invocation.invoke();
	    }
	    else{
	    	((ActionSupport)invocation.getAction()).addActionError("请先以管理员的身份登陆");;
	    	return "input";
	    }
	}

}
