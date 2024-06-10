package exceptionDemo;

import java.util.Scanner;

public class ExceptionExFirst {

	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter A :");
			int a = sc.nextInt();
			System.out.println("Enter B :");
			int b = sc.nextInt();
			int c = a/b;
			System.out.println("DIVITION = "+c);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}

	}

}
