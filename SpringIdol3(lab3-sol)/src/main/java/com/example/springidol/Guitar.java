package com.example.springidol;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Guitar implements Instrument {
	@Value("${cymbal.sound}")
	String sound;
	
	public Guitar() {
	}

	public void play() {
		// System.out.println("STRUM STRUM STRUM");
		System.out.println(sound);
	}
}
