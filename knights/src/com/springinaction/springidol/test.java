package com.springinaction.springidol;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	ApplicationContext ctx=null;
	@Before
	public void init(){
		ApplicationContext context = 
		        new ClassPathXmlApplicationContext("spring-idol.xml");
		ctx=context;
	}
	@Test
	public void testJug() throws PerformanceException{
		Performer j=(Performer)ctx.getBean("poeticDuke");
		j.perform();
	}
	
	@Test
	public void stage() throws PerformanceException{
		Instrumentalist ins=(Instrumentalist)ctx.getBean("kenny2");
		ins.perform();
	}

}
