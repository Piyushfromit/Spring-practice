package useOfSupper;

class A{
	
	public A(){
		System.out.println("in A");
	}
	
	public A(int n){
		System.out.println("in A with int "+ n);
	}
	
}

class B extends A{
	
	public B(){
		  //  super();   //  by default there is super, so it is calling parent class constructor
		System.out.println("in B");
	}
	
	public B(int n) {
		super (5);
		System.out.println("in B with int "+ n);
	}
	
}


public class Demo {
	
   public static void main(String[] args) {
	     
	  B obj1 = new B();
	   
	  B obj2 = new B(5);
	   
   }

}
