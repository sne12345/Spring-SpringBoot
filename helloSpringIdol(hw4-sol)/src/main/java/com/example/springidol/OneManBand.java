package com.example.springidol;

import java.util.Collection;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hank")
public class OneManBand implements Performer, BeanNameAware {
	public OneManBand() {
	}

	@Autowired
	@Qualifier("forOneManBand")
	private Collection<Instrument> instruments;

	// 또는 아래의 setter에 @Autowired와 @Qualifier("forOneManBand") 사용해도 됨
	// 또는 아래의 setter와 파라메터에 각각 @Autowired와 @Qualifier("forOneManBand") 사용해도 됨
	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}

	@Override
	public String perform() throws PerformanceException {
		String result = new String();
		for (Instrument instrument : instruments) {
			result += (instrument.play() + "<br>");
		}
		return result;
	}

	private String beanName;

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}
	
	@Override
	public String getBeanName() {
		return beanName;
	}

	@Value("${hank.name}")	
	private String name;
	
	@Override
	public String getName() {
		return name;
	}
}
