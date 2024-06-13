package ThreadMethodDemo;

public class DaemonThread extends Thread{
	
	public void run(){
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon thread..");
		}
		else
		{
			System.out.println("Child thread..");
		}
	}

	public static void main(String[] args) {
		System.out.println("Main thread..");
		
		DaemonThread d = new DaemonThread();
		d.setDaemon(true);
		d.start();

	}

}
