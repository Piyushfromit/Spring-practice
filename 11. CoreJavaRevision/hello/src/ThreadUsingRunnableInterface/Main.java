package ThreadUsingRunnableInterface;

public class Main {
	
	
	public static void main(String[] args) {
		
        ThreadA t1 = new ThreadA();
		
		Thread t = new Thread(t1);

		t.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("Inside Main Thread "+ i);
		}
		
		System.out.println("End of main Thread");
	}
	

}
