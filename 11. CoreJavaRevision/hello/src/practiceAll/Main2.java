package practiceAll;

public class Main2 {
	static int a= 5;
	int b= 10;
	
	public static void main(String[] args) {
		
		System.out.println("Value of A is: "+a);
		// System.out.println(b);
		
		Main2 obj1 = new Main2();
		obj1.a=15;
		obj1.b=20;
		
		
		Main2 obj2 = new Main2();
		obj2.a=25;
		obj2.b=30;
		
		System.out.println("Value of A In obj1 is: "+obj1.a);
		System.out.println("Value of B In obj1 is: "+obj1.b);
		
		System.out.println("Value of A in obj2 is: "+obj2.a);
		System.out.println("Value of B in obj2 is: "+obj2.b);
		
	}
}
