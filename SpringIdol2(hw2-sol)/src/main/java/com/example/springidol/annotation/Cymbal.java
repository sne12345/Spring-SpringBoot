package com.example.springidol.annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.springidol.Instrument;

@Component
@Qualifier("forHank")
public class Cymbal implements Instrument {
  public Cymbal() {}
  
  public void play() {
    System.out.println("CRASH CRASH CRASH");
  }
}
