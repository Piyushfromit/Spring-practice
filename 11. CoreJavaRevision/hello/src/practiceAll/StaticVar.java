package practiceAll;

public class StaticVar {
	
	 //   int count =0;   it will not increment and create again again 
	
	 static int count =0;    //  it will increment and create only once.
	 
	 void printCount() {
		 System.out.println(count++);
	 }
	 
	 
	 public static void main(String[] args) {
		 StaticVar c1 =new StaticVar();
		 StaticVar c2 =new StaticVar();
		 StaticVar c3 =new StaticVar();
		 
		 c1.printCount();
		 c2.printCount();
		 c3.printCount();
	}
	 
	 

}
