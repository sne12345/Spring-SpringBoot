package com.example.springidol.annotation;

import com.example.springidol.PerformanceException;
import com.example.springidol.Performer;

public class Juggler implements Performer {
	private int beanBags = 3;

	public Juggler() {
	}

	public Juggler(int beanBags) {
		this.beanBags = beanBags;
	}

	@Override
	public void perform() throws PerformanceException {
		System.out.println("JUGGLING " + beanBags + " BEANBAGS");
	}
}
