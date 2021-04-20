package com.example.springidol;

import java.util.Map;

public class OneManBand implements Performer {
	private Map<String, Instrument> instruments; // Map 타입 property

	public OneManBand() {}

	public void setInstruments(Map<String, Instrument> instruments) {
		this.instruments = instruments;
	}

	@Override
	public void perform() throws PerformanceException {
		for (String key : instruments.keySet()) {
			System.out.print(key + ": ");
			Instrument instrument = instruments.get(key);
			instrument.play();
		}
	}
}
