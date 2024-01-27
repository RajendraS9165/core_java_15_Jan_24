
public class Employee {
	
	private int id;
	private String name;
	private double basicSalary;
	private double hra; //40% of bs
	private final double FIXED_BONUS = 100;
	private double pf; //12% of bs
	public static final String companyName;
	
	static {
		companyName = "Invision";
		//id = 100; non static/data member/instance member can be access in static block or method
	}
	
	public Employee() {
		this(1,"rajendra",50000.00);
	}

	public Employee(int id, String name, double basicSalary) {
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		setSalaryComponent();
		//companyName = "Invision";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
		setSalaryComponent();
	}

	public double getHra() {
		return hra;
	}

	public double getPf() {		
		return pf;
	}

	public double getFIXED_BONUS() {
		return FIXED_BONUS;
	}
	
	public double computeNetSalary() {
		return basicSalary+hra+FIXED_BONUS+pf;
		//bs+pf+hra+fixed;
	}
	
	public void Display() {
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
		System.out.println("BasicSalary = "+ basicSalary);
		System.out.println("PF is = "+getPf());
		System.out.println("HRA is = "+getHra());
		System.out.println("NET salary = "+computeNetSalary());
	}

	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", basicSalary=" + basicSalary + ", hra=" + hra
				+ ", FIXED_BONUS=" + FIXED_BONUS + ", pf=" + pf + "]";
	}
	
//	public static void setCompanyName(String companyName) {
//		Employee.companyName = companyName;
//	}
	
	public static String getCompanyName() {
		//id = 100;
		return companyName;
	}
	
	private void setSalaryComponent() {
		pf = .12 * basicSalary;
		hra = .4 * basicSalary;	
	}
			
			
	
	
	
}
