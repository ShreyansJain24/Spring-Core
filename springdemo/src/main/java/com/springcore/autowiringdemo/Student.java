package com.springcore.autowiringdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private String name;
	private int age;
	private String mother;
	@Autowired
	private Address address;
	
	public String getName() {
		return name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("set age");
		this.age = age;
	}
	public String getMother() {
		return mother;
	}
	public void setMother(String mother) {
		System.out.println("set Mother");
		this.mother = mother;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", mother=" + mother + ", address=" + address + "]";
	}
	
	
	
	

}
