package com.example.springidol;

import org.springframework.stereotype.Component;

@Component
public class Piano implements Instrument {
	public Piano() {}
  
	public void play() {
		System.out.println("PLINK PLINK PLINK");
	}
  
	public void tune() {
		System.out.println("Piano.tune(): Tuning the piano.");	// 조율
	}
	
	public void clean() {
		System.out.println("Piano.clean(): Cleaning the piano."); // 청소
	}
}
