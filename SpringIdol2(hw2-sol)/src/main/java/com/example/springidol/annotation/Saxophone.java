package com.example.springidol.annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.springidol.Instrument;

@Component
@Qualifier("forHank")
public class Saxophone implements Instrument {
  public Saxophone() {}
  
  public void play() {
    System.out.println("TOOT TOOT TOOT");
  }
}
