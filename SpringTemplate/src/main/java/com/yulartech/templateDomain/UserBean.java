package com.yulartech.templateDomain;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Component;

/*
 * @Named
@Component
@Scope("session")
 */
@Component
@ManagedBean
@SessionScoped
public class UserBean{
	 
    //later inject in faces-config.xml
	//@Autowired
	UserBo userBo;
	
	public void setUserBo(UserBo userBo) {
		this.userBo = userBo;
	}
	
	public String printMsgFromSpring() {		
		return userBo.getMessage();
		
	}

}