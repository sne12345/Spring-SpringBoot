package com.example.springidol;

import org.springframework.stereotype.Component;

@Component
public class Piano implements Instrument {
	public Piano() {
	}

	public void tune() {
		System.out.println("Piano.tune(): Tuning the piano.");
	}
	
	public void clean() {
		System.out.println("Piano.clean(): Cleaning the piano.");
	}
	
	public void play() {
		System.out.println("PLINK PLINK PLINK");
	}
}
