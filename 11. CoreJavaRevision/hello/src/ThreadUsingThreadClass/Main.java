package ThreadUsingThreadClass;

public class Main {
	
	
	public static void main(String[] args) {
		
		ThreadA t1 = new ThreadA();
		ThreadB t2 = new ThreadB();
		
		t1.start();
		t2.start();
		
		
		for(int i=0; i<5; i++) {
			System.out.println("Inside Main Thread "+ i);
		}
		
		System.out.println("End of main Thread");
	}
	

}
