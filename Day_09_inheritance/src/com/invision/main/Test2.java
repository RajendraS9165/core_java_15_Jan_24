package com.invision.main;

import com.invision.pkg1.Employee;

public class Test2 {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "jack", 1000);
		Employee emp2 = new Employee(1, "jack", 1000);
		Employee emp3 = new Employee(2, "jack", 1000);
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		String s3 = new String("abd");
		System.out.println(s1.hashCode()+ "  "+s2.hashCode()+ "  "+s3.hashCode());
	}

}
