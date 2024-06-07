package stringDemo;
import java.util.Scanner;
public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str, rev = "";
		System.out.print("Enetr a string : ");
		str = sc.nextLine();
		int len = str.length();
		for(int i=len-1 ; i>=0 ; i--)
		{
			rev = rev + str.charAt(i);
		}
		if(str.equalsIgnoreCase(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
