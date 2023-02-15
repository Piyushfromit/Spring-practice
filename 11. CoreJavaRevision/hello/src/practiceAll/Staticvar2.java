package practiceAll;

public class Staticvar2 {
	
	
	int num1=5;
	
	static int num2=10;
	
	void print1 () {
		System.out.println(num1 + " " + num2);
	}
	
    static void print2 () {
    	//   System.out.println(num1 + " " + num2);   Error
    	
    	System.out.println(num2);
	}
    
    public static void main(String[] args) {
		
    	Staticvar2 p = new Staticvar2();
    	
    	p.print1();
    	
    	Staticvar2.print2(); // Static method can call without object;
    	
	}

}
