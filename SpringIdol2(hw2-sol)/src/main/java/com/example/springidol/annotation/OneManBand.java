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
  
  // 또는 아래의 setter에 @Autowired와 @Qualifier("forHank")를 사용해도 됨  
  // 또는 아래의 setter와 파라메터에 대해 각각 @Autowired와 @Qualifier("forHank")를 사용해도 됨  
  public void setInstruments(Collection<Instrument> instruments) {
	  this.instruments = instruments;
  }
  
  public void perform() throws PerformanceException {
	  for(Instrument instrument : instruments) {
		  instrument.play();
	  }
  } 
}
