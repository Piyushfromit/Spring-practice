package practiceAll;

public interface DemoInterface {
	
	public static void main(String[] args) {
		System.out.println("hi");
		
		
	}
	
	public void hello();
	
	public default void hey() {
		
	};
	
    public static void hi() {
		
	};
	
	
//    public void goodMorning() {    //   CompileTime Error 
//		
//	};

}

// ****************

//         An Interface Can have Only Abstract method.
//  Since java 8 Interface Can have  Static And Default Method also. 