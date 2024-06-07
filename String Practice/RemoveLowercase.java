package stringDemo;

public class RemoveLowercase {

	public static void main(String[] args) {
		String str = "BHAGYAshri";
		System.out.println("Before removing lowercase : "+str);
		String str1 = "";
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(!(c >= 'a' && c <='z'))
			{
				str1 += c;
			}
		}
				
		System.out.println("After removing lowercase : "+str1);
	}

}
