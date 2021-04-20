package com.example.springidol;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("forOneManBand")
public class Harmonica implements Instrument {
	public Harmonica() {
	}

	public String play() {
		return "HUM HUM HUM";
	}
}
