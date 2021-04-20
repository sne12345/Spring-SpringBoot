package com.example.springidol;

import org.springframework.beans.factory.BeanNameAware;

public class Juggler implements Performer, BeanNameAware {
	private int beanBags = 3;

	public Juggler() {
	}

	public Juggler(int beanBags) {
		this.beanBags = beanBags;
	}

	@Override
	public String perform() throws PerformanceException {
//		System.out.println("JUGGLING " + beanBags + " BEANBAGS");
		return ("JUGGLING " + beanBags + " BEANBAGS");
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

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
}
