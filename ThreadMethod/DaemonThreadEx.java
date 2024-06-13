package ThreadMethodDemo;

public class DaemonThreadEx {

	public static void main(String[] args) {
		Thread userThread = new Thread(() ->{
			try{
				for(int i=0; i<=10; i++){
					System.out.println("User thread 1 :"+i);
					Thread.sleep(1000);
				}
			}
			catch(InterruptedException e)
			{
				throw new RuntimeException(e);
			}
		});
		
		Thread daemonThread = new Thread (()->{
			try{
				for(int i=0; i<=10; i++){
					System.out.println("Daemon thread :"+i);
					Thread.sleep(2000);
				}
			}
			catch(InterruptedException e)
			{
				throw new RuntimeException(e);
			}
		});
		
		userThread.start();
		daemonThread.setDaemon(true);
		daemonThread.start();
		
	}

}
