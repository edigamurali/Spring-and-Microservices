package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/operations")
public class ControllerClass 
{
	@RequestMapping("/report")
	public String showReport()
	{
		return "showReport1";
	}
}
