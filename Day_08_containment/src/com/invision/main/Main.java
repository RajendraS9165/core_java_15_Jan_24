package com.invision.main;

import com.invision.Address;
import com.invision.Employee;
import com.invision.MyDate;

public class Main {
	
	public static void main(String[] args) {
		Address add = new Address("Pune", "123456");
		MyDate doj = new MyDate(11, 11, 2020);
		Employee emp = new Employee(1, "Jack", 1000, doj, add);
		System.out.println(emp);
		
		
		Employee emp1 = new Employee();
		emp1.setId(2);
		emp1.set
	}

}
