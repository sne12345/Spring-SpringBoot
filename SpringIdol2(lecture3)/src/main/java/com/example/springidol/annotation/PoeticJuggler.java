package com.example.springidol.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.springidol.PerformanceException;
import com.example.springidol.Poem;

@Component("duke")
public class PoeticJuggler extends Juggler {
	private Poem poem;

	public PoeticJuggler() { }
 
	@Autowired	
	public PoeticJuggler(Poem poem) {
		super();
		this.poem = poem;
	}

	public PoeticJuggler(int beanBags, Poem poem) {
		super(beanBags);
		this.poem = poem;
	}

	@Override
	public void perform() throws PerformanceException {
		super.perform();
		System.out.println("While reciting...");
		poem.recite();
	}
}
