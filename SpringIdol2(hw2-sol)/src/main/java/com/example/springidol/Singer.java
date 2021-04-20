package com.example.springidol;

public class Singer implements Performer {
	private String name;
	private Song song;

	public Singer() {
	}

	public Singer(String name, Song song) {
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
