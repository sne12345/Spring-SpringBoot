package com.example.springidol;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Harmonica implements Instrument {
	@Value("${cymbal.sound}")
	String sound;
	
	public Harmonica() {
	}

	public void play() {
		// System.out.println("HUM HUM HUM");
		System.out.println(sound);
	}
}
