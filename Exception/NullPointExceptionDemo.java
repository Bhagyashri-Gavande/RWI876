package exceptionDemo;

public class NullPointExceptionDemo {

	public static void main(String[] args) {
		
		try
		{
			String str = null;
			int len = str.length();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
