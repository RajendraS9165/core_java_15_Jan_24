package com;

public class MyDate {
	private int dd=27;
	private int mm=12;
	private int yy=2024;
	
	public MyDate(){
		System.out.println("MyDate is Called");
	}
	
	public boolean isLeapYear(int y) {
		if((y%4==0 & y%400==0) | (y%100!=0 & y%4==0)) {
//			System.out.println("Leap Year");
			return true;
		}else {
//			System.out.println("Normal year");
			return false;
		}
	}
	
	public String getMonth() {
		switch(mm) {
		case 1: 
			return "January";
		case 2: 
			return "February";
		case 3: 
			return "March";
		case 4: 
			return "April";
		case 5: 
			return "May";
		case 6: 
			return "June";
		case 7: 
			return "July";
		case 8: 
			return "August";
		case 9: 
			return "September";
		case 10: 
			return "October";
		case 11: 
			return "November";
		case 12: 
			return "December";
		default:
			return "Invalid Month";
		}
	}
	
	
	public void display(){
		System.out.println(dd+"/"+mm+"/"+yy);
	}
	
	
	
	
	public void addDays(int day) {
		int d = dd;
		int m = mm;
		int y = yy;
		int temp = d+day;
		System.out.println(d+"/"+m+"/"+y);
		while(temp>0) {
			
			if((y%4==0 & y%400==0) | (y%100!=0 & y%4==0)) {
				if(temp>29) {
					if(m==1 | m==3 | m==5 | m==7| m==8| m==10 | m==12) {
						temp= temp-31;
						m=m+1;
						if(m>12) {
							y=y+1;
							m= m%12;
						}
					}else
					if(m==4 | m==6 | m==9 | m==11) {
						temp= temp-30;
						m= m+1;
						if(m>12) {
							y=y+1;
							m= m%12;
						}
					}else {
						temp= temp-29;
						m= m+1;
						if(m>12) {
							y=y+1;
							m= m%12;
						}
					}
				}else {
					if(temp==0) {
						temp=1;
					}
					else {
						d=temp;
					}
					break;
				}
			}else {
				if(temp>28) {
					if(m==1 | m==3 | m==5 | m==7| m==8| m==10 | m==12) {
						temp= temp-31;
						m=m+1;
						if(m>12) {
							y= y+1;
							m= m%12;
						}
					}else
					if(m==4 | m==6 | m==9 | m==11) {
						temp= temp-30;
						m= m+1;
						if(m>12) {
							y=y+1;
							m= m%12;
						}
					}else if(m==2) {
						temp = temp-28;
						m= m+1;
						if(m>12) {
							y=y+1;
							m= m%12;
						}
					}
				}else {
					if(temp==0) {
						temp=1;
					}else {
						d=temp;
					}
					break;
				}
			}
		}
		if(temp==0) {
			d = 1;
		}
		System.out.println(d+"/"+m+"/"+y);
	}
	
	public int LastDay() {
		if(isLeapYear(yy)) {
			switch(mm) {
			case 1,3,5,7,8,10,12:
				return 31;
			case 4,6,9,11:
				return 30;
			case 2:
				return 29;
			default:
				return 1;
			}
		}else {
			switch(mm) {
			case 1,3,5,7,8,10,12:
				return 31;
			case 4,6,9,11:
				return 30;
			case 2:
				return 28;
			default:
				return 1;
			}
		}
	}
	
}