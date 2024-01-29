package pkg2;

import pkg1.Employee;

public class Main {
	public static void main(String[] args) {
		Employee e1 = new Employee(1,"rahul", 1000,"pune");
		System.out.println(e1);
		We e2 = new We();
		e2.setAddress("pune");
		e2.setId(5);
		e2.setName("Mahesh");
		e2.setSalary(500);
		System.out.println(e2);
		
	}
}
