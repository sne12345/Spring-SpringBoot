package com.example.springidol;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.core.env.Environment;
//import javax.annotation.PostConstruct;

@Component("chris")
public class Singer implements Performer, BeanNameAware {
	private String name;
	private Song song;
	
	public Singer() {
	}

	public Singer(String name) {
		this.name = name;
	}

	@Autowired				// constructor 기반 injection  
	public Singer(@Value("${chris.name}") String name, Song song) {
		this.name = name;
		this.song = song;
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
	public String perform() throws PerformanceException {
//		System.out.println(name + " is singing a song \"" + song.getTitle() + "\""
//							+ " by " + song.getArtist());
		return (name + " is singing a song \"" + song.getTitle() + "\""
				+ " by " + song.getArtist());
	}

	private String beanName;

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}
	
	@Override
	public String getBeanName() {
		return beanName;
	}
}
