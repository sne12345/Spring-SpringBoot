package com.example.springidol;

import org.springframework.beans.factory.BeanNameAware;

public class Singer implements Performer, BeanNameAware {
	private String name;
	private Song song;
	private String beanName;

	
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}
	
	@Override
	public String getBeanName() {
		return beanName;
	}


	public Singer() {
	}

	public Singer(String name) {
		this.name = name;
	}

	public Singer(String name, Song song) {
		this.song = song;
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSong(Song song) {
		this.song = song;
	}

	public Song getSong() {
		return song;
	}
	
	
	

	@Override
	public void perform() throws PerformanceException {
		System.out.println(name + " is singing a song \"" + song.getTitle() + "\""
							+ " by " + song.getArtist());
	}	
}
