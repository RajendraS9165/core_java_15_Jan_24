
public class EmpyMain {

	public static void main(String[] args) {
		
		Employee d1 = new Employee();
		d1.setId(12);
		d1.Display();
		Line();
		d1.setName("Ravi Prajapat");
		d1.Display();
		Line();
		d1.setBasicSalary(100000.0);
		d1.Display();

	}
	
	
	
	public static void Line() {
		System.out.println("------------------------------------------");
	}

}