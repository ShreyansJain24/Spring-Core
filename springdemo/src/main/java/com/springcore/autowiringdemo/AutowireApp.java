package com.springcore.autowiringdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireApp {
	 public static void main( String[] args )
	    {
	        ApplicationContext context =
	        		 new ClassPathXmlApplicationContext("com/springcore/autowiringdemo/autowireconfig.xml");
	        Student st= context.getBean("student",Student.class);
	        System.out.println(st.toString());
	    }
}
