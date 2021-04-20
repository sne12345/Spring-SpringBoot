package com.example.springidol;

public class Song {
  private String title;
  private String artist;

  public Song() { }
  
  public Song(String title) {
    this.title = title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
  
  public String getTitle() {
    return title;
  }
  
  public void setArtist(String composer) {
	this.artist = composer;
  }
  
  public String getArtist() {
	return artist;
  }
}
