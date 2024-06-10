package exceptionDemo;

public class ExceptionExFourth {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		
		try{
			Thread.sleep(2500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		t.interrupt();
		System.out.println("Interrupt Called");
	}

}
