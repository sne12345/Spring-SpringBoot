package com.example.springidol;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("forOneManBand")
public class Guitar implements Instrument {
	public Guitar() {
	}

	public void play() {
		System.out.println("STRUM STRUM STRUM");
	}
}
