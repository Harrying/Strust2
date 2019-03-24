package com.interceptor;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

@SuppressWarnings("serial")
public class LoginInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation inv) throws Exception {
		ActionContext context = ActionContext.getContext();
		String user = String.valueOf(context.getSession().get("user"));
		System.out.println(user+"shdh");
		if(user != null ){
			return inv.invoke();
		}else{
			((ActionSupport)inv.getAction()).addActionError("ÇëÏÈµÇÂ¼£¡£¡£¡");
			return Action.LOGIN;
		}
	}

}
