package com;

public class right_angle_triangle {

	public static void main(String[] args) {
//		pattern();
//		pattern2();
//		pattern3();
		pattern4();

	}
	
	public static void pattern()  {
		for(int i=0;i<9;i++) {
			for(int j=0; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void pattern2() {
		for(int i=0;i<4;i++) {
			for(int j=1;j<=4-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void pattern3() {
		for(int i=0;i<=4;i++) {
//			space
			for(int j=0;j<=4-i;j++) {
				System.out.print(" ");
			}
//			for star
			for(int k=1;k<=i*2-1;k++) {
				System.out.print("*");
			}
//			new line 
			System.out.println();
			}
	}
	
	public static void pattern4() {
		int row=6;
		for(int i=0;i<1;i++) {
			System.out.println(" *");
		}
		for(int i=0; i<=row-2;i++) {
			System.out.print(" ");
			System.out.print("*");
			for(int j=0; j<=i-1;j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		System.out.print(" ");
		for(int i=0;i<row;i++) {
			System.out.print("*");
		}
		
	}

}
