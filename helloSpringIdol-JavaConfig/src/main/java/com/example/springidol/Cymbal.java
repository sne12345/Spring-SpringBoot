package com.example.springidol;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("forOneManBand")
public class Cymbal implements Instrument {
	public Cymbal() {
	}

	public void play() {
		System.out.println("CRASH CRASH CRASH");
	}
}
