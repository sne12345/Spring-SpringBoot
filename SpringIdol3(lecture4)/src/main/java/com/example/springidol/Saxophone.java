package com.example.springidol;

import org.springframework.stereotype.Component;

@Component
public class Saxophone implements Instrument {
	public Saxophone() {
	}

	public void play() {
		System.out.println("TOOT TOOT TOOT");
	}
}
