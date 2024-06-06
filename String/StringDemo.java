package stringDemo;

public class StringDemo {

	public static void main(String[] args) {
		String a = "Bhagya";
		String b = "Gavande";
		String c = "  Moni  ";
		String d = "bhagya";
		
		System.out.println("Lower Case = "+a.toLowerCase());
		System.out.println("Upper Case = "+b.toUpperCase());
		System.out.println("String Concat = "+a.concat(b));
		System.out.println("Length of A = "+a.length());
		System.out.println("Length of B = "+b.length());
	    System.out.println("String is empty = "+a.isEmpty());
	    System.out.println("Character at 2nd position = "+b.charAt(2));
	    System.out.println("Index of g = "+a.indexOf("g"));
	    System.out.println("Checking Equality = "+a.equals(b));
	    System.out.println("e replace with o = "+b.replace("e", "o"));
	    System.out.println("Trim word = "+c.trim());
	    System.out.println("Compare String = "+a.compareTo(d));
	    System.out.println("Compare to ignore case = "+a.compareToIgnoreCase(d));
	    System.out.println("Conatins String = "+a.contains(d));
	    System.out.println("Sub String = "+d.substring(3));
	  
	}

}