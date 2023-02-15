package LambdaExp;

public class Main {
	
	public static void main(String[] args) {
		
		
		Intr i1 = (String name) -> {        // -> lambda exp;
			System.out.println(name);
		};

		i1.sayHello("piyush");
		
	}
}
