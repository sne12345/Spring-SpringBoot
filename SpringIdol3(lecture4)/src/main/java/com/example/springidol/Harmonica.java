package com.example.springidol;

import org.springframework.stereotype.Component;

@Component
public class Harmonica implements Instrument {
	public Harmonica() {
	}

	public void play() {
		System.out.println("HUM HUM HUM");
	}
}
