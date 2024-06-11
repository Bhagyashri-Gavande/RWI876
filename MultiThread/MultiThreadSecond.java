package MultiThreadDemo;

public class MultiThreadSecond extends Thread{

	public void run()
	{
		for(int i=10; i>=1; i--)
		{
			System.out.println("Thread value : "+i);
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
