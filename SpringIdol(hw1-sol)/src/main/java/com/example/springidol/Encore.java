package com.example.springidol;

public class Encore {
	private Performer encorePerformer;

	public void setEncorePerformer(Performer perfomer) {
		this.encorePerformer = perfomer;
	}

	public void execute() {
		System.out.println("<Encore Performance>");
		encorePerformer.perform();
	}
}
