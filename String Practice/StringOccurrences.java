package stringDemo;
import java.util.*;
public class StringOccurrences {

	public static void main(String[] args) {
		String str = "Programming";
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		char strArray[] = str.toCharArray();
		for(char c : strArray)
		{
			if(charMap.containsKey(c))
			{
				int x = charMap.get(c);
				charMap.put(c, x+1);
			}
			else
			{
				charMap.put(c, 1);
			}
			
		}
		System.out.println(charMap);
	}

}
