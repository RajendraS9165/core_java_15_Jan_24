package com;

public class NewClass {

	public static void main(String[] args) {
		int num=10 , i=0, j=1 , sum;
		System.out.print(i);
		while(num>0) {
			sum=i+j;
			i=j;
			System.out.print(","+i);
			j=sum;
			num--;
		}
	}

}
