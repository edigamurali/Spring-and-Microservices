package com.nt.service;

import java.time.LocalTime;

import org.springframework.stereotype.Service;

@Service
public class wishmessageServiceImp implements IWishMessageService {

	@Override
	public String generateMessage() 
	{
		 LocalTime t = LocalTime.now();

	        if (t.isAfter(LocalTime.of(4, 0)) && t.isBefore(LocalTime.of(12, 1))) {
	            return "morning";
	        } else if (t.isAfter(LocalTime.of(12, 0)) && t.isBefore(LocalTime.of(16, 1))) {
	            return "afternoon";
	        } else if (t.isAfter(LocalTime.of(16, 0)) && t.isBefore(LocalTime.of(21, 1))) {
	            return "evening";
	        } else {
	            return "night";
	        }
	}

}
