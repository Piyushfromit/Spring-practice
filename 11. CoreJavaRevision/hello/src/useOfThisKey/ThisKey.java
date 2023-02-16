package useOfThisKey;

public class ThisKey {

	
    int n = 100;
	
	void fun1() {
		
	int	n = 200;
		
		System.out.println(n);
		System.out.println(this.n);   // this keyword is refers to current object. 
		
	}
	
	public static void main(String[] args) {
		
		ThisKey obj = new ThisKey();
		obj.fun1();
		
		int n = 300;
		System.out.println(n);
		
		// System.out.println(this.n);   this keyword can not use inside static class 
		
	}
	
	
}
