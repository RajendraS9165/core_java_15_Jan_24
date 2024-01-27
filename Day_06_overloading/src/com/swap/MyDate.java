package com.swap;

public class MyDate {
	
	private int dd;
	private int mm;
	private int yy;
	
	public MyDate() {

	}

	public MyDate(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getYy() {
		return yy;
	}

	public void setYy(int yy) {
		this.yy = yy;
	}

	public String toString() {
		return dd+"/"+mm+"/"+yy;
	}
	
}
