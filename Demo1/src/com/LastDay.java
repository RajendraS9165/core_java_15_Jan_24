package com;

public class LastDay {
	
	
	private int dd = 10;
	private int mm = 01;
	private int yy = 2024;

	public boolean isLeapYear() {
		int y=yy;
		if((y%4==0 & y%400==0) | (y%100!=0 & y%4==0)) {
//			System.out.println("Leap Year");
			return true;
		}else {
//			System.out.println("Normal year");
			return false;
		}
		

			
		
	}

}