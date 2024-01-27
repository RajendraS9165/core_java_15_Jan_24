package com.invision.comp;

public class Main {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1, "Jack", 1000);
		
		Address add1 = new Address(12345,"Pune");
		emp1.setAddress(add1);
		
		
		//Address add2 = new Address(1111, "Mumbai");
		Employee emp2 = new Employee(2, "John", 2000, add1  );
		
		
		Employee emp3 = new Employee(3,"Sam", 3000, new Address());
		
		//d1,d2
		// swap(d1,d2);
		//print(d1, d2);
		
	}
	


}
