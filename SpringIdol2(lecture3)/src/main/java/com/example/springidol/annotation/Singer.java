package com.example.springidol.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.example.springidol.PerformanceException;
import com.example.springidol.Performer;

@Component("chris")
public class Singer implements Performer {
	
	
	private String name;
	
	private Song song;

	@Autowired(required=false)
	public Singer() {
	}

	@Autowired(required=false)
	public Singer(@Value("Chris Kim") String name, 
				  @Qualifier("bohemian") Song song) {
		this.name = name;
		this.song = song;
	}

	public Song getSong() {
		return song;
	}

	@Override
	public void perform() throws PerformanceException {
		System.out.println(name + " is singing a song \"" + song.getTitle() + "\" by " + song.getArtist());
	}
}
