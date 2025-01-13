package com.nt.conroller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.ISeasonFinderService;
@Controller
public class SeasonOperationsController 
{
	@Autowired
	private ISeasonFinderService service;
	
	@RequestMapping("/")
	public String showHome()
	{
		return"welcome";
	}
	@RequestMapping("/season")
	public String showSeason(Map<String,Object> map)
	{
		//use service
		String msg=service.findseason();
		//keep results in model attribute
		map.put("resultMsg", msg);
		return"display";
	}
}
