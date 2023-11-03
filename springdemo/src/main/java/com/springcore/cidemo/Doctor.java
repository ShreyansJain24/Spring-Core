package com.springcore.cidemo;

public class Doctor {
 private String name;
 private int age;
 private Nurse nurse; 
 
public Doctor() {
	super();
	System.out.println("no arg doctor const called");
	// TODO Auto-generated constructor stub
}

public Doctor(String name, String age, Nurse nurse) {
	super();
	System.out.println("all arg string doctor const called");
	this.name = name;
	this.age = Integer.parseInt(age);
	this.nurse = nurse;
}

public Doctor(String name, int age, Nurse nurse) {
	super();
	System.out.println("all arg doctor const called");
	this.name = name;
	this.age = age;
	this.nurse = nurse;
}


@Override
public String toString() {
	return "Doctor [name=" + name + ", age=" + age + ", nurse=" + nurse + "]";
}

  
}
