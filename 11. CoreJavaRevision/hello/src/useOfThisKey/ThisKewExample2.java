package useOfThisKey;

public class ThisKewExample2 {
	
	int num1;
	int num2;
	
	public ThisKewExample2() {
		// TODO Auto-generated constructor stub
	}
	
	public ThisKewExample2(int num1 , int num2) {
     //	 num1=num1;    // output =0; 
     //  num2=num2;    // output =0; 
		
		this.num1=num1;
		this.num2=num2;
	}
	
	public static void main(String[] args) {
		
		ThisKewExample2 obj = new ThisKewExample2(5,6);
		
		System.out.println(obj.num1);
		System.out.println(obj.num2);
		
	}

}
