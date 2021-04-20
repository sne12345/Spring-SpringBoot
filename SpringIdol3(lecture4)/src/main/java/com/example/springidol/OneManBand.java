package com.example.springidol;

import java.util.Properties;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hank")
public class OneManBand implements Performer, BeanNameAware {
	public OneManBand() {
	}

	private Properties instruments;

	@Autowired
	public void setInstruments(Properties instruments) {
		this.instruments = instruments;
	}
	
	private String beanName;
	

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}
	
	@Override
	public String getBeanName() {
		return beanName;
	}

	@Override
	public void perform() throws PerformanceException {
		for (Object element : instruments.keySet()) {
			String key = (String) element;
			System.out.println(key + " : " + instruments.getProperty(key));
		}
	}

}
