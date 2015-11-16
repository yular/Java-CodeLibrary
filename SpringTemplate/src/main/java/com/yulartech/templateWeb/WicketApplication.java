package com.yulartech.templateWeb;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;

public class WicketApplication extends WebApplication {

	@Override
	public Class<SimplePage> getHomePage() {

		return SimplePage.class; // return default page
	}
	
	@Override
	protected void init() {
		
		super.init();
		addComponentInstantiationListener(new SpringComponentInjector(this));
		 
	}

}
