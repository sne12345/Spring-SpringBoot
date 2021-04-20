package com.example.springidol;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Saxophone implements Instrument {
	@Value("${saxophone.sound}")
	String sound;
	
	public Saxophone() {
	}

	public void play() {
		// System.out.println("TOOT TOOT TOOT");
		System.out.println(sound);
	}
}
