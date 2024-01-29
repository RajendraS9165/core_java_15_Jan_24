package com.invision.pkg2;

import com.invision.pkg1.Employee;

//WageEmployee is an Employee
public class WageEmployee extends Employee{
	private double rate;
	private int hours;
	public final int BONUS = 200;
	
	public WageEmployee() {
		super();
		System.out.println("WE default constructor called...");
	}
	
	public WageEmployee(int id, String name, double rate, int hours) {
		super(id,name);
		System.out.println("We parmeterized contructor called...");
		this.rate = rate;
		this.hours = hours;
	}
	
	public WageEmployee(int id, String name, double salary, double rate, int hours) {
		super(id,name,salary);
		System.out.println("We parmeterized contructor called...");
		this.rate = rate;
		this.hours = hours;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public String toString() {
		return "Emp: "+super.toString()+ "\nWageEmployee [rate=" + rate + ", hours=" + hours + "]\n";
	}
	
	//override
	@Override
	public double netSalary() {
		System.out.println("net salary of WE called");
		return super.netSalary()+ rate*hours;
	}	
	
	//override
	@Override
	public int getBONUS() {
		return BONUS;
	}
	
	public double computeVariable() {
		return rate * hours;
	}

}















