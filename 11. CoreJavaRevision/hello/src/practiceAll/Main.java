package practiceAll;

public class Main {
	static int a=9;
	int b=10;
	
	public static void main(String[] args) {
		System.out.println(a);
		// System.out.println(b);
		// hello();
		hi();
		Main obj = new Main();
		obj.hello();
		
	}
	
	public  void hello() {
        System.out.println(a);
		System.out.println(b);
        System.out.println(hi());
		
	}
	
	public static String hi() {
		return "hi";
	}

}
