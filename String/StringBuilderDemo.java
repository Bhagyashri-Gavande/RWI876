package stringDemo;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		str.append("Bhagya");
		str.append(" ");
		str.append("Gavande");
		System.out.println(str);
		
		StringBuilder str1 = new StringBuilder("Java");
		System.out.println(str1.reverse());

	}

}
