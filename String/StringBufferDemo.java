package stringDemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Bhagya");
		System.out.println(str);
		System.out.println("String Append = "+str.append("Gavande"));
		System.out.println(str);
		System.out.println("String Insert = "+str.insert(6, "shri"));
		System.out.println("String Delete = "+str.delete(10, 17));
		System.out.println("String Reverse = "+str.reverse());
		System.out.println("string length = "+str.length());
		System.out.println("String Reverse = "+str.reverse());
		System.out.println("String index of = "+str.indexOf("Bha"));
		System.out.println("String index of = "+str.indexOf("ha"));
		System.out.println("String index of = "+str.indexOf("a"));
		System.out.println("String index of = "+str.indexOf("BHA"));
		System.out.println("String index of = "+str.indexOf("shri"));
		System.out.println("String chat at = "+str.charAt(6));
		System.out.println("Sub String =  "+str.substring(6));
		System.out.println("Sub Sequence = "+str.subSequence(2, 8));
		System.out.println(str);
	}

}
