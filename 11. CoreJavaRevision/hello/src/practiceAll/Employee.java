package practiceAll;

public class Employee {
	
	int empId;
	String name;
	static String company = "Tata";   // memory management
	
	
	
	
	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
		
	}

	void display() {
	   System.out.println(empId+" "+ company+" "+name);
	   
	}
	
	public static void main(String[] args) {
		Employee em= new Employee(101, "Piyush" );
		em.display();
		
		Employee em2= new Employee(102, "Bittu");
		em2.display();
	}

}
