package stringDemo;

public class StringFirstNonRepeating {

	public static void main(String[] args) {
		String str = "Bhagya";
		for(int i=0;i<str.length();i++)
		{
			int count = 0;
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(i) == str.charAt(j))
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println("First non repeating char is : "+str.charAt(i));
				break;
			}
		}

	}

}
