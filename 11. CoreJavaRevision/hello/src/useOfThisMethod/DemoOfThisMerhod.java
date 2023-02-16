package useOfThisMethod;

public class DemoOfThisMerhod {
	
     public DemoOfThisMerhod() {
    	 
	     System.out.println("in Demo");
     }
	
	
     public DemoOfThisMerhod(int n) {
    	 this();    //  this method will execute the constructor of same class 
	     System.out.println("in Demo With int " + 5);
     }
     
     
     public static void main(String[] args) {
    	
    	 DemoOfThisMerhod obj = new DemoOfThisMerhod(5);
     }
	

}
