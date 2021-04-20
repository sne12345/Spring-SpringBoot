package com.example.springidol;

public class Singer implements Performer {
	
	
	public String name;
	public Song song;
	
	public Singer() {
		
	}
	
	public Singer(String name, Song song) {
		this.name = name;
		this.song = song;
	}

	public String getName() {
		return name;
	}

	public void perform() {
		System.out.println(name + " is singing a song " +  song.getTitle() + " by " + song.getComposer());
	}
}
