package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("/controller")
public class ControllerOperations 
{
	//@RequestMapping({"/report","/req","/"})
	//@RequestMapping(value="/REPORT",method=RequestMethod.GET)
	//@GetMapping("/report")
	@RequestMapping("/report")
	public String showReport1()
	{
		System.out.println("ControllerOperations.showReport1()");
		return "showReport1";
	}
	
	//@RequestMapping("/REPORT")
	//@PostMapping("/report")
	//@GetMapping("/report")->IllegalStateException
	public String showReport2()
	{
		return "showReport2";
	}
	/*
	@RequestMapping("/home")
	public String homePage()
	{
		return "welcome";
	}
	@RequestMapping
	public String ForwardHomePage()
	{
		return "forward:operations/report";
	}*/

	@RequestMapping("/home")
	public String homePage()
	{
		System.out.println("ControllerOperations.homePage()");
		return "welcome";
	}
	@RequestMapping
	public String ForwardHomePage()
	{
		System.out.println("ControllerOperations.ForwardHomePage()");
		return "redirect:report";
	}
}
