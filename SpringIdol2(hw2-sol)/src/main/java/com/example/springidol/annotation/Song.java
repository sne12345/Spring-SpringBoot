package com.example.springidol.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bohemian")
public class Song {
  private String title;
  private String artist;

  public Song() { }
  
  public Song(String title) {
    this.title = title;
  }

  @Value("Bohemian Rhapsody")
  public void setTitle(String title) {
    this.title = title;
  }
  
  public String getTitle() {
    return title;
  }
  
  @Value("Queen")
  public void setArtist(String composer) {
	this.artist = composer;
  }
  
  public String getArtist() {
	return artist;
  }
}
