
public class MyDate {
	
	private int dd;
	private int mm;
	private int yy;
	private final int x;
	
	
	public MyDate() {
		this(1,1,2024);
		//System.out.println("defafult constructor called "+this);
		/*dd =1;
		mm = 1;
		yy = 2024;*/
	
	}
	
	public MyDate(int dd, int mm, int y) {
		//System.out.println("Patameterized constructor called "+ this);
		this.dd = dd;
		this.mm = mm;
		this.yy = y;
		x= 10;
	}
	
	public void display() {
		System.out.println(this+" = "+ dd+"/"+mm+"/"+yy);
	}
	
	public void setDay(int dd){
		this.dd = dd;
	}
	
	public void setMm(int m) {
		mm = m;
	}
	
	public int getYear() {
		return yy;
	}
	
	public void finalize() {
		System.out.println("hey ram!!!!");
		display();
	}
	
	
	public String toString() {
		return dd+"-"+mm+"-"+yy;
	}
	
	public int lastDay() {
		int lastDay = 31;
		switch(mm) {
		case 4:
		case 6:
		case 9:
		case 11: lastDay = 30; break;
		
		case 2: lastDay = isLeapYear(yy)?29:28;
		}
		
		return lastDay;
	}
	
	public static boolean isLeapYear(int year) {
		return year%400 == 0? true: year%100!=0 && year%4 == 0?true:false;
	}
	
	

}
