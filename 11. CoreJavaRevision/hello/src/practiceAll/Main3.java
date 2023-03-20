package practiceAll;

public class Main3 {
	static int roll;
	String name;
	int marks;
	
	public static void main(String[] args) {
		
		int classNumber;
		String School;
		
		Main3 obj=new Main3();
		System.out.println(roll);    //  0 
		System.out.println(obj.roll); //  0  
		System.out.println(obj.name);  //  null
		System.out.println(obj.marks);  //  0
		
		// System.out.println(classNumber);  // error
		obj.hello();
		
	}
	
	void hello() {
		int classNumber;
		String School;
		
		System.out.println(roll); //  0  
		System.out.println(name);  //  null
		System.out.println(marks);  //  0
		
		// System.out.println(classNumber);  // error
		
		
	} 
	
	

}
