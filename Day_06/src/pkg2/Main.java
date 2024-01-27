package pkg2;

import pkg1.Address;
import static pkg1.Address.COUNTRY;
import static java.lang.System.out;

public class Main {
	
	public static void main(String[] args) {
		//Address add1 = new Address(); //default constructor can't be called in another package
		out.println(COUNTRY);
		
	}

}
