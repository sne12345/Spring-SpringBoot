package com.example.springidol.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.example.springidol.Instrument;

@Component
public class Guitar implements Instrument {
  @Value("STRUM STRUM STRUM")
  private String sound;
  
  public Guitar() {}
  
  public void play() {
    System.out.println(sound);
  }
}
