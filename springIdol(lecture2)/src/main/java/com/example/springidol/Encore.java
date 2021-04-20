package com.example.springidol;

public class Encore {
	Performer encorePerformer;
	
	public Encore() {
		
	}
	
	public void setEncorePerformer(Performer encorePerformer) {
		this.encorePerformer = encorePerformer;
	}
	
	public void execute() {
		System.out.println("<Encore Performence>");
		encorePerformer.perform();
	}
}
