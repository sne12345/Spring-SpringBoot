package com.example.springidol.annotation;

import org.springframework.stereotype.Component;

import com.example.springidol.Instrument;

@Component
public class Piano implements Instrument {
  public Piano() {}
  
  public void play() {
    System.out.println("PLINK PLINK PLINK");
  }
}
