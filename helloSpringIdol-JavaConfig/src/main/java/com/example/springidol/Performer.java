package com.example.springidol;

public interface Performer {
	public void perform() throws PerformanceException;
	public String getBeanName();
}
