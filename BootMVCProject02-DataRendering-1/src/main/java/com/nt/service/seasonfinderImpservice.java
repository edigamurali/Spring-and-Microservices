package com.nt.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;
@Service
public class seasonfinderImpservice implements ISeasonFinderService {

	@Override
	public String findseason() 
	{
		//get system date
		LocalDate ld=LocalDate.now();
		
		//get current month
		int month=ld.getMonthValue();
		
		if(month>=7 && month<=9)
			return "Rainy Season";
		else if(month>=3 && month<=6)
			return "Summer Season";
		else
			return "Winter Season";
	}

}
