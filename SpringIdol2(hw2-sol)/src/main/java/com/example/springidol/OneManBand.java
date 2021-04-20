package com.example.springidol;

import java.util.Properties;

public class OneManBand implements Performer {
	public OneManBand() {
	}

	private Properties instruments;

	public void setInstruments(Properties instruments) {
		this.instruments = instruments;
	}

	@Override
	public void perform() throws PerformanceException {
		for (Object element : instruments.keySet()) {
			String key = (String) element;
			System.out.println(key + " : " + instruments.getProperty(key));
		}
	}

}
