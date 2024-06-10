package exceptionDemo;

public class ExceptionExSecond {

	public static void main(String[] args) {
		try{
			int a = 10/0;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
