package exceptionDemo;

public class MyThread extends Thread{
	public void run()
	{
		int iteration = 5;
		try
		{
			for(int i=0; i<iteration; i++)
			{
				System.out.println("In try block");
				sleep(1000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("In catch block");
		}
	}

}
