package com.example.springidol.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.springidol.Performer;
import com.example.springidol.TalentCompetition;

@Component
public class SpringIdol implements TalentCompetition {
	@Autowired		// 또는 @Inject 
	private Performer[] performers;

	public SpringIdol() {
	}

	public void run() {
		for (int i = 0; i < performers.length; i++) {
			System.out.println("Performer #" + (i + 1));
			Performer performer = performers[i];
			performer.perform();
			System.out.println("-----------------------");
		}
	}

	public Performer[] getPerformers() {
		return performers;
	}

	public void setPerformers(Performer[] performers) {
		this.performers = performers;
	}
}
