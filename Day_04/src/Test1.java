
public class Test1 {
	
	public static void main(String[] args) {
		MyDate d1 = new MyDate();
		d1.display();
		
		MyDate d2 = new MyDate(10,10,2024);
		d2.display();
		
		//d2.dd = 12; private member cannot be access outside the class
		d2.setDay(12);
		d2.setMm(11);
		d2.display();
		
		int year = d2.getYear();
		System.out.println("year = "+year);
	}

}
