package stringDemo;

public class StringUpperLowerCount {

	public static void main(String[] args) {
		String str = "BHAGYAshri";
		int countUpper = 0, countLower = 0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				countUpper ++;
			}
			else
			{
				countLower ++;
			}
		}
		System.out.println("Uppercase Character : "+countUpper);
		System.out.println("Lowercase Character : "+countLower);
		
	}

}
