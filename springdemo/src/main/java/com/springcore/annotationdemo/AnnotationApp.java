package com.springcore.annotationdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.annotationdemo.Student;

public class AnnotationApp {
	public static void main( String[] args )
    {
        ApplicationContext context =
        		 new AnnotationConfigApplicationContext(AnotationConfig.class);
        Student st= context.getBean("student",Student.class);
        System.out.println(st.toString());
    }
}
