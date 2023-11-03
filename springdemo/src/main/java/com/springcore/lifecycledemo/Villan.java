package com.springcore.lifecycledemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//public class Villan implements DisposableBean,InitializingBean{
public class Villan{
	private String name ;
	private String power;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("name set");
		this.name = name;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		System.out.println("power set");
		this.power = power;
	}
	
	@Override
	public String toString() {
		return "Villan [name=" + name + ", power=" + power + "]";
	}

@PostConstruct
public void init() {
	System.out.println("init Villan");
}

@PreDestroy
public void dest() {
	System.out.println("dest Villan");
}
	
//	@Override
//	public void destroy() throws Exception {
//		System.out.println("init Villan");
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("dest Villan");
//		// TODO Auto-generated method stub
//		
//	}
	
//	public void init() {
//		System.out.println("init Villan");
//	}
//	
//	public void dest() {
//		System.out.println("dest Villan");
//	}

	
}
