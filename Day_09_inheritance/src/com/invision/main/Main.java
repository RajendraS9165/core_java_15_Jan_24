package com.invision.main;

import com.invision.pkg1.Employee;
import com.invision.pkg2.WageEmployee;

public class Main {
	
	public static void main(String[] args) {
		
		WageEmployee we2 = new WageEmployee(1,"Jack", 1000, 10,20);
		System.out.println(we2);
		System.out.println("net salary: "+we2.netSalary());
		System.out.println("Bonus: "+we2.BONUS);  //200
		System.out.println("Bonus: "+we2.getBONUS()); //200
		System.out.println("variable: "+we2.computeVariable());
		
		printLine();
		
		Employee we3 = new WageEmployee(2,"Jessica", 2000, 40,20);
		System.out.println("net salary: "+we3.netSalary());
		System.out.println("Bonous: "+we3.BONUS); //100
		System.out.println("Bonous: "+we3.getBONUS()); //200
		System.out.println("variable: "+((WageEmployee)we3).computeVariable());
		printLine();
		
		
		
		Employee e = new Employee(3, "Sam", 3000);
		System.out.println("net salary: "+e.netSalary());
		System.out.println("Bonous: "+e.BONUS); //100
		System.out.println("Bonous: "+e.getBONUS()); //100
		
		
	}
	
	
	public static void printLine() {
		System.out.println("=====================================");
	}

}
