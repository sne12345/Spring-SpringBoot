package com.example.springidol;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cymbal implements Instrument {	
	@Value("${cymbal.sound}")
	String sound;
	
	public Cymbal() {
	}
	
	public void play() {
		// System.out.println("CRASH CRASH CRASH");
		System.out.println(sound);
	}
}
