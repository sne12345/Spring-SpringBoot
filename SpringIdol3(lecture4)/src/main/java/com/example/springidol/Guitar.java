package com.example.springidol;

import org.springframework.stereotype.Component;

@Component
public class Guitar implements Instrument {
	public Guitar() {
	}

	public void play() {
		System.out.println("STRUM STRUM STRUM");
	}
}
