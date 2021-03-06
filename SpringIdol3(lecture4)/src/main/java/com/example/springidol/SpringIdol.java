package com.example.springidol;

import org.springframework.beans.factory.annotation.Autowired;

public class SpringIdol implements TalentCompetition {
	@Autowired
	private Performer[] performers;
	
	private int stageSize;
	
	@Autowired
	private Piano piano;
	
	
	public void setStageSize(int size) {
		this.stageSize = size;
		System.out.println("SpringIdol.setStageSize():무대크기 = " + stageSize);
	}
	
	public void tunePiano() {
		System.out.println("SpringIdol.tune(): 피아노 조율");
		piano.tune();
	}
	
	public void cleanPiano() {
		System.out.println("SpringIdol.clean(): 피아노 청소");
		piano.clean();
	}
	


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
			System.out.print("<Performance #" + (i+1) + " by ");
			Performer performer = performers[i];
			System.out.println(performer.getBeanName() + ">");
			performer.perform();
			System.out.println("-----------------------");
		}
	}
}
