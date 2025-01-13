package com.nt.controller;

import java.time.LocalTime;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.IWishMessageService;

@Controller
public class WishMessageOperator 
{
	@Autowired
	IWishMessageService service;
	
	@RequestMapping("/")
	public String showHome()
	{
		return "welcome";
	}
	@RequestMapping("/generate")
	public String showMessage(Map<String,Object> map)
	{
		String msg=service.generateMessage();
		map.put("resultmsg", msg);
		return"generate";
	}
}
