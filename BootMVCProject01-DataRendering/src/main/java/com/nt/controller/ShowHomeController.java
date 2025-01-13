package com.nt.controller;

import java.util.Date;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowHomeController 
{
	/*@RequestMapping("/process")
	public String displayHomePage(Map<String,Object> map)
	{
		System.out.println("ShowHomeController.displayHomePage() "+map.getClass());
		//add model attributes to shared memory
		map.put("sysDate",new Date());
		map.put("age",new Random().nextInt(100));
		map.put("name","murali");
		//return LVN
		return "welcome";
	}*/
	/*@RequestMapping("/process")
	public String displayHomePage(Model model)
	{
		System.out.println("ShowHomeController.displayHomePage() "+model.getClass());
		//add model attributes to shared memory
		model.addAttribute("sysDate",new Date());
		model.addAttribute("age",new Random().nextInt(100));
		model.addAttribute("name","murali");
		//return LVN
		return "welcome";
	}*/
	/*@RequestMapping("/process")
	public String displayHomePage(ModelMap model)
	{
		System.out.println("ShowHomeController.displayHomePage() "+model.getClass());
		//add model attributes to shared memory
		model.addAttribute("sysDate",new Date());
		model.addAttribute("age",new Random().nextInt(100));
		model.addAttribute("name","murali");
		//return LVN
		return "welcome";
	}*/
	//return type is Model
	/*@RequestMapping("/welcome")
	public Model displayHomePage()
	{
		Model model=new BindingAwareModelMap();
		model.addAttribute("name","murali");
		model.addAttribute("age",23);
		model.addAttribute("sysDate",new Date());
		return model;
	}*/
	//return type is Map
	/*@RequestMapping("/welcome")
	public Map<String,Object> displayHomePage()
	{
		Map map=new HashMap();
		map.put("name","murali");
		map.put("age",23);
		map.put("sysDate",new Date());
		return map;
	}*/
	
	//legacy style ModelAndView Return Type
	/*@RequestMapping("/process")
	public ModelAndView displayHomePage()
	{
		ModelAndView model=new ModelAndView();
		model.addObject("name","murali");
		model.addObject("age",23);
		model.addObject("sysDate",new Date());
		//seting LVN
		model.setViewName("welcome");
		return model;
	}*/
	
	//forwarding request to one handler method to another handler method
	/*@RequestMapping("/home")
	public String process(Map<String,Object> map)
	{
		System.out.println("ShowHomeController.displayHome()  ");
		map.put("name","murali");
		map.put("age",new Random().nextInt(100));
		return "forward:report";
	}
	@RequestMapping("/report")
	public String showReport(Map<String,Object> map)
	{
		System.out.println("ShowHomeController.showReport()");
		map.put("sysdate",new Date());
		return "showData";
	}*/
	
	//request redirecting
	@RequestMapping("/home")
	public String process(Map<String,Object> map)
	{
		System.out.println("ShowHomeController.displayHome()  ");
		map.put("name","murali");
		map.put("age",new Random().nextInt(100));
		
		return "redirect:report?p1=val1&p2=val2";
	}
	@RequestMapping("/report")
	public String showReport(Map<String,Object> map)
	{
		System.out.println("ShowHomeController.showReport()");
		map.put("sysdate",new Date());
		return "showData";
	}
	
}
