package com.example.springidol.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springidol.TalentCompetition;

public class SpringIdolMain_annotation {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("springIdol-annotation.xml");

		TalentCompetition competition = ctx.getBean("springIdol", TalentCompetition.class);
		competition.run();
		
		Encore encore = ctx.getBean("encore", Encore.class);
		encore.execute();

		ctx.close();
	}
}
