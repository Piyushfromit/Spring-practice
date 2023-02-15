package ThreadUsingThreadClass;

public class ThreadB extends Thread{
	
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("Inside the Thread B "+i);
		}
		
		System.out.println("End of Thread B");
	}

}
