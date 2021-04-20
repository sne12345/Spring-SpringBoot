package com.example.springidol;

import org.springframework.beans.factory.BeanNameAware;

public class Instrumentalist implements Performer, BeanNameAware {
	public Instrumentalist() {
	}

	private String song;

	public void setSong(String song) {
		this.song = song;
	}

	private Instrument instrument;

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	
	private String beanName;
	
	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}
	
	@Override
	public String getBeanName() {
		return this.beanName;
	}

	@Override
	public void perform() throws PerformanceException {
		System.out.print("Playing " + song + " : ");
		instrument.play();
	}
}
