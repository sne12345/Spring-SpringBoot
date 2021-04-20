package com.example.springidol.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.springidol.Performer;
import com.example.springidol.TalentCompetition;

@Component
public class SpringIdol implements TalentCompetition {
	
	@Autowired
	private Performer[] performers;

	public SpringIdol() {
	}
	
	public Performer[] getPerformers() {
		return performers;
	}

	public void setPerformers(Performer[] performers) {
		this.performers = performers;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < performers.length; i++) {
			System.out.println("<Performance #" + (i+1) + ">");
			Performer performer = performers[i];
			performer.perform();
			System.out.println("-----------------------");
		}
	}
}
