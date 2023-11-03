package com.springcore.cidemo;

public class Nurse {
	private String name;
	private int wages;

	public Nurse() {
		super();
		System.out.println("no arg nurse const called");
		// TODO Auto-generated constructor stub
	}

	public Nurse(String name, int wages) {
		super();
		System.out.println("all arg nurse const called");
		this.name = name;
		this.wages = wages;
	}

	@Override
	public String toString() {
		return "Nurse [name=" + name + ", wages=" + wages + "]";
	}

}
