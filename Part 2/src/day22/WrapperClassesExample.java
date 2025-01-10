package day22;

public class WrapperClassesExample {

	public static void main(String[] args) {
		
		//Case1: Convert String to other data types
		
		//String str = "swaroop"; //Invalid input for Number
		String str = "12345";
		int x = Integer.parseInt(str);
		System.out.println(x);
		
		String str1 = "555.345"; //double value in the String
		String str2 = "111.222";
		System.out.println(str1+str2); //concatenation
		double d1 = Double.parseDouble(str1);
		double d2 = Double.parseDouble(str2);
		System.out.println(d1+d2);
		
		//String to char - multiple characters to single char
		//Character.parseCharacter -- not available
		
		//String to boolean
		//String s = "true"; //returns true when it is true
		//String s = "false";
		String s = "swaroop"; 
		//return false in all other cases except true
		
		boolean b = Boolean.parseBoolean(s);
		System.out.println(b);
		
		
		
	}

}
