package com.example.springidol.javaconf2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.springidol.Encore;
import com.example.springidol.Performer;
import com.example.springidol.SpringIdol;

@Configuration
public class SpringConf2 {
	@Autowired
	private SpringConf1 conf1;			// 다른 설정 클래스 SpringConf1 객체가 자동 주입됨
	
	@Bean
	public SpringIdol springIdol() {
		SpringIdol si = new SpringIdol();
		si.setPerformers(new Performer[]{conf1.duke(), conf1.instr(), conf1.hank()});
		return si;		
	}
	
	@Bean
	public Encore encore() {
		Encore encore = new Encore();
		encore.setPerformer(conf1.duke());		
		return encore;		
	}
}