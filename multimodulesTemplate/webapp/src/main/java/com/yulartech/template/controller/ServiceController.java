package com.yulartech.template.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.yulartech.template.domain.Shop;

@Controller
@RequestMapping("/service")
public class ServiceController {

	@RequestMapping(value="{name}", method=RequestMethod.GET)
	@ResponseBody
	public Shop getShopInfo(@PathVariable String name){
		Shop res = new Shop();
		res.setName(name);
		res.setStaffName(new String[]{"yular","xcc"});
		res.setItemName(new String[]{"Machine Learning","ACM"});
		
		return res;
	}
}
