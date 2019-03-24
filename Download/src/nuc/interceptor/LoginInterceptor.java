package nuc.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		ActionContext actionContext=invocation.getInvocationContext();
		String username=(String)actionContext.getContext().getSession().get("username");
		if(username!=null&&username.equals("wsh")){
			return invocation.invoke();
		}
		else{
			((ActionSupport)invocation.getAction()).addActionError("ÇëÏÈµÇÂ¼");
			return "input";
		}
	}

}
