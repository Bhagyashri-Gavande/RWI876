package stringDemo;

public class StringVowel {

	public static void main(String[] args) {
		String str= "Bhagyashri";
		int vowel = 0;
		for(int i=0; i<str.length();i++)
		{
			char c = str.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			{
				vowel = vowel+1;
			}	
		}
		System.out.println("Number of vowel in a string : "+vowel);
	}

}
