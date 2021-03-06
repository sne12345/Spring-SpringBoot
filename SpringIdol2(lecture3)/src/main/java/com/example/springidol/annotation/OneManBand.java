package com.example.springidol.annotation;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.springidol.Instrument;
import com.example.springidol.PerformanceException;
import com.example.springidol.Performer;

@Component("hank")
public class OneManBand implements Performer {
  public OneManBand() {}
  
  @Autowired
  @Qualifier("forHank")
  private Collection<Instrument> instruments;
  
  public void setInstruments(Collection<Instrument> instruments) {
	  this.instruments = instruments;
  }
  
  public void perform() throws PerformanceException {
	  for(Instrument instrument : instruments) {
		  instrument.play();
	  }
  } 
}
