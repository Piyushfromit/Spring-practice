package ThreadUsingRunnableInterface;

public class ThreadA implements Runnable{
	
	
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("Inside the Thread A "+i);
		}
		System.out.println("End of Thread A");
	}

}

