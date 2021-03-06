package com.example.springidol.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bohemian")
public class Song {
	@Value("Bohemian Rhapsody")
	private String title;
	@Value("Queen")
	private String artist;

	public Song() {
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getArtist() {
		return artist;
	}
}
