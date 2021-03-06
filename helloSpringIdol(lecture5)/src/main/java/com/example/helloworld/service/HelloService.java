package com.example.helloworld.service;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springidol.Performer;

@Service
public class HelloService {

	Map <String, Performer> map = new HashMap<>();
	
	@Autowired
	public HelloService(List<Performer> list) {
		for(Performer per : list) {
			map.put(per.getBeanName(), per);
		}
	}
	
	public String getGreeting() {		// business method
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		if (hour >= 6 && hour <= 10) {
			return "Good morning! ";
		} else if (hour >= 12 && hour <= 15) {
			return "Did you have lunch? ";
		} else if (hour >= 18 && hour <= 24) {
			return "Good evening! ";
		}
		return "Hello! ";
	}
	
	public Performer getPerformer(String id) {
		return map.get(id);
	}
}
