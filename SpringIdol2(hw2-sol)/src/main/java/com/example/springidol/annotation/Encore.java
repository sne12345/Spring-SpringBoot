package com.example.springidol.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.example.springidol.Performer;

@Component
public class Encore {
	private Performer performer;

	@Value("#{springIdol.performers[T(java.lang.Math).random()*springIdol.performers.length]}")
	public void setPerformer(Performer p) {
		this.performer = p;
	}

	public void execute() {
		System.out.println("Encore Performance!");
		performer.perform();
	}
}
