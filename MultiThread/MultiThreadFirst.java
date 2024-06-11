package MultiThreadDemo;

public class MultiThreadFirst implements Runnable
{
	@Override
	public void run() {
		for(int i=1; i<=10; i++)
		{
			System.out.println("Value of i is : "+i);
			try{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		
		MultiThreadFirst m1 = new MultiThreadFirst();
		Thread t1 = new Thread(m1);
		//t1.start();
		
		MultiThreadSecond m2 = new MultiThreadSecond();
		t1.start();
		m2.start();
	}

}
