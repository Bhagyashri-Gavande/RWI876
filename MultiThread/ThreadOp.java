package MultiThreadDemo;

public class ThreadOp {

	public static void main(String[] args) {
		System.out.println("Program started...");
		int x=52+38;
		System.out.println("Sum : "+x);
		Thread t1 = Thread.currentThread();
		String tname = t1.getName();
		System.out.println("Currunt running thread is : "+tname);
		t1.setName("MyMain");
		System.out.println(t1.getName());
		
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println(t1.getId());
		
		userThread ut = new userThread();
		ut.start();
		
		System.out.println("Program ended...");
		}

}

class userThread extends Thread
{
	public void run()
	{
		System.out.println("This is user define thread...");
	}
}
