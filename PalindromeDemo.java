package arrayDemo;

public class PalindromeDemo {

	public static void main(String[] args) {
		int num = 12321, rev = 0, rem, temp;
		temp = num;
		while(temp != 0 )
		{
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp /= 10;
		};
		if(num == rev)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");

	}

}
