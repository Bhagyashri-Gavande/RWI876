package stringDemo;

public class StringOccur {

	public static void main(String[] args) {
		
		String str = "Javavavvavavav";
		int totalCount = str.length();
		int totalCount_afterRemove = str.replace("J", "").length();
		int totalCount_afterRemove1 = str.replace("a", "").length();
		int totalCount_afterRemove2 = str.replace("v", "").length();
		int count = totalCount - totalCount_afterRemove;
		int count1 = totalCount - totalCount_afterRemove1;
		int count2 = totalCount - totalCount_afterRemove2;
		System.out.println("J.."+count);
		System.out.println("A.."+count1);
		System.out.println("V.."+count2);
	}

}
