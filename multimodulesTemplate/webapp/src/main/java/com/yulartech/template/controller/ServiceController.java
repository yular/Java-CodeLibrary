package com.yulartech.template.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.yulartech.template.domain.Shop;

import com.yulartech.template.dto.RequestDTO;
import com.yulartech.template.dto.ResponseDTO;

import com.yulartech.template.functions.*;

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
	
	@RequestMapping(value="/getdtoresult", method=RequestMethod.POST)
    @ResponseBody //@RequestBody RequestDTO request //@RequestParam(value = "name", required = true) String name  
    public ResponseDTO getDTOInfo(@RequestBody RequestDTO request, HttpServletResponse response){
    	ResponseDTO res = new ResponseDTO();
    	res.setVal(Integer.parseInt(StringUtils.reverseString(String.valueOf(request.getVal()))));
    	res.setLst(request.getLst());
        return res;
    }
	
	/**
     * simply add more headers so that we can call this cross-domain and avoid the Javascript restriction on cross domain ajax
     *
     * @param response
     */
    private void addHeadersToResponse(HttpServletResponse response) {
            response.addHeader("Access-Control-Allow-Headers", "origin, content-type, accept, x-requested-with, my-cool-header");
            // seconds to cache preflight request --> less OPTIONS traffic
            response.setHeader("Access-Control-Allow-Origin", "*");
            response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
            response.setHeader("Access-Control-Max-Age", "3600");
            response.setHeader("Access-Control-Allow-Headers", "x-requested-with, origin, content-type, accept");
    }
}
