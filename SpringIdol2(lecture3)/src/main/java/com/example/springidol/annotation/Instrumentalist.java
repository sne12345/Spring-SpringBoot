package com.example.springidol.annotation;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.example.springidol.Instrument;
import com.example.springidol.PerformanceException;
import com.example.springidol.Performer;

@Component("kenny")
public class Instrumentalist implements Performer {
	public Instrumentalist() {
	}
	
	@Value("Jingle Bells")
	private String song;

	
	public void setSong(String song) {
		this.song = song;
	}

	@Resource(name="guitar")
	private Instrument instrument;

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	@Override
	public void perform() throws PerformanceException {
		System.out.print("Playing " + song + " : ");
		instrument.play();
	}
}
