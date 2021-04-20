package com.example.springidol;

public interface Performer {
	public String perform() throws PerformanceException;
	public String getBeanName();
	public String getName();
}
