package com.invision.pkg1;

import java.util.Objects;

public class Employee {
	
	private int id;
	public String name;
	double salary;
	protected double hra;
	public final int BONUS = 100;
	
	protected Employee() {
		super();
		System.out.println("Employee default contructor");
	}
	
	public Employee(int id, String name) {
		System.out.println("EMployee parameterized contructor with two param");
		this.id = id;
		this.name = name;
	}

	public Employee(int id, String name, double salary) {
		System.out.println("EMployee parameterized contructor");
		this.id = id;
		this.name = name;
		this.salary = salary;
		setSalaryComponent();
	}
	
	private void setSalaryComponent() {
		this.hra = this.salary *.4;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
		setSalaryComponent();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public double netSalary() {
		System.out.println("net salary of Employee called");
		return salary+hra+BONUS;
	}
	
	public int getBONUS() {
		return BONUS;
	}
	
//	public double computeVariable() {
//		return 0;
//	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (id+name+salary).hashCode();
		//return Objects.hash(id,name,salary);
	}
	
	

}
