package com.yulartech.templateDomain;

public class UserSpringAction {

	UserBo userBo;
	
	public UserBo getUserBo() {
		return userBo;
	}

	public void setUserBo(UserBo userBo) {
		this.userBo = userBo;
	}

	public String execute() throws Exception {
		
		userBo.printUser();
		return "success";
		
	}
	
}
