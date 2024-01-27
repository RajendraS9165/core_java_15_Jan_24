package com.invision.main;

import com.invision.WageEmployee;

public class Main {
	
	public static void main(String[] args) {
		WageEmployee we1 = new WageEmployee();
		System.out.println(we1);
		printLine();
		
		WageEmployee we2 = new WageEmployee(1,"Jack", 1000, 10,20);
		System.out.println(we2);
	}
	
	
	public static void printLine() {
		System.out.println("=====================================");
	}

}
