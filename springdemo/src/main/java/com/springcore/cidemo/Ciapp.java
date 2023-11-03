package com.springcore.cidemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ciapp {
    public static void main(String arg[]) {
		ApplicationContext con= 
				new ClassPathXmlApplicationContext("com/springcore/cidemo/ciconfig.xml");
		Doctor doctor = (Doctor)con.getBean("doc");
		System.out.println(doctor);
	}
}
	