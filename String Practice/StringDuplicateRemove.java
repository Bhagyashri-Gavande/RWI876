package stringDemo;

public class StringDuplicateRemove {

	public static void main(String[] args) {
		String str = "bhagyashri";
		String output = "";
		 
		for(int i=0; i<str.length(); i++)
		{
			boolean check = false;
			for(int j=0;j<output.length(); j++)
			{
				if(output.charAt(j)==str.charAt(i))
				{
					check = true;
					break;
				}
			}
			if(!check)
			{
				output = output+str.charAt(i);
			}
		}
		System.out.println("Output is : "+output);
	}

}
