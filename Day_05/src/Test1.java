
public class Test1 {
	
	public static void main(String[] args) {
		System.out.println();
		   
		System.out.println("Total number of emp =>"+Employee.getEmployeeCount());
		
		Employee e1 = new Employee("Jack", 1000);
		Employee e2 = new Employee("Sam", 2000); 
		
		System.out.println("Total number of emp =>"+Employee.getEmployeeCount());
		
		
		//System.out.println(e1);
		//System.out.println(e2);
		
		
	}

}