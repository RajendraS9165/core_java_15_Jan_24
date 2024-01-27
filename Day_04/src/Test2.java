
public class Test2 {
	
	public static void main(String[] args) {
		MyDate d1 = new MyDate();
		printLine();
		
		MyDate d2 = new MyDate(10,10,2024);
		printLine();
		
		d1.display();
		System.out.println(d1);
		d2.display();
		
		d1 = d2;
		
		/*
		for(int i=0;i<=999999;i++) {
			d1 = new MyDate();
		}*/
		printLine();
		System.gc(); //requesting gc to clean the unwanted memory
		
		System.out.println("Main end!!!");
		
	}
	
	public static void printLine() {
		System.out.println("----------------------------------");
		final int x;
	
	}

}
