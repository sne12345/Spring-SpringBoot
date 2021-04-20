package com.example.springidol.autowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springidol.Encore;
import com.example.springidol.TalentCompetition;

public class SpringIdolMain_autowire {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("springIdol-autowire.xml");

		TalentCompetition competition = ctx.getBean("springIdol", TalentCompetition.class);
		competition.run();		
		Encore encore = ctx.getBean("encore", Encore.class);
		encore.execute();

		ctx.close();
	}
}
