package com.example.springidol;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Piano implements Instrument {
	@Value("${piano.sound}")
	String sound;
	
	public Piano() {
	}

	public void tune() {
		System.out.println("Piano.tune(): Tuning the piano.");
	}
	
	public void clean() {
		System.out.println("Piano.clean(): Cleaning the piano.");
	}
	
	public void play() {
		// System.out.println("PLINK PLINK PLINK");
		System.out.println(sound);
	}
}
