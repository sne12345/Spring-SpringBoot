package com.example.springidol.annotation;

import org.springframework.stereotype.Component;

import com.example.springidol.Instrument;

@Component
public class Guitar implements Instrument {
	public Guitar() {
	}

	public void play() {
		System.out.println("STRUM STRUM STRUM");
	}
}
