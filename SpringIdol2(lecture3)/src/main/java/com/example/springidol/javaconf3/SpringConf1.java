package com.example.springidol.javaconf3;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.springidol.Guitar;
import com.example.springidol.Instrumentalist;
import com.example.springidol.OneManBand;
import com.example.springidol.Poem;
import com.example.springidol.PoeticJuggler;
import com.example.springidol.Saxophone;
import com.example.springidol.Singer;
import com.example.springidol.Song;
import com.example.springidol.Sonnet29;

@Configuration
public class SpringConf1 {
	
	@Bean
	public Saxophone saxophone() {	  	// method 이름을 bean의 ID로 사용 ("saxophone") 
		return new Saxophone();			// Saxophone type bean 생성  
	}
	
	@Bean
	public Guitar guitar() {	    
		return new Guitar();		
	}
		
	@Bean
	public Poem sonnet29() {
		return new Sonnet29();
	}
	
	@Bean
	public Song bohemian() {
		Song bohemian = new Song();
		bohemian.setTitle("Bohemian Rhapsody");
		bohemian.setArtist("Queen");
		return bohemian;
	}
	
	@Bean
	public PoeticJuggler duke() {
		return new PoeticJuggler(5, sonnet29());
	}
	
	@Bean(name="kenny")				// name 속성을 통해 bean ID 지정 가능 
	public Instrumentalist instr() {
		Instrumentalist instr = new Instrumentalist();
		instr.setSong("Jingle Bells");	
		instr.setInstrument(saxophone());		// Setter-based DI
		return instr;
	} 
	
	@Bean		
	public OneManBand hank() {
		Properties props = new Properties();
		props.setProperty("GUITAR", "STRUM STRUM STRUM");
		props.setProperty("CYMBAL", "CRASH CRASH CRASH");
		props.setProperty("HARMONICA", "HUM HUM HUM");
		OneManBand omb = new OneManBand();		
		omb.setInstruments(props);
		return omb;
	}	
	
	@Bean
	public Singer chris() {
		return new Singer("Chris Kim", bohemian());
	}
	
	@Bean
	public Singer jain() {
		return new Singer("Jain Lee", chris().getSong());
	}
}