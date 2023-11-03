package com.springcore.lifecycledemo;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lifeapp {
	 public static void main( String[] args ){	
		 AbstractApplicationContext cons= 
				new ClassPathXmlApplicationContext("com/springcore/lifecycledemo/lifeconfig.xml");
		Villan vill= (Villan) cons.getBean("vill");
		System.out.println(vill);
		//registering shutdown hook
		cons.registerShutdownHook();
	}

}
