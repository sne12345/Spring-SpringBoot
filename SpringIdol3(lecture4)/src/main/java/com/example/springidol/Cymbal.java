package com.example.springidol;

import org.springframework.stereotype.Component;

@Component
public class Cymbal implements Instrument {
	public Cymbal() {
	}

	public void play() {
		System.out.println("CRASH CRASH CRASH");
	}
}
