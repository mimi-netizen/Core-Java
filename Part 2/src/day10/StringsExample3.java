package day10;

public class StringsExample3 {

	public static void main(String[] args) {
		
		//contains() -- returns boolean  - true/false
		// checks for the given String is part if the main string 
		String s1 = "Swaroop"; //main string
		String s2 = "Swa"; //part of the main string
		System.out.println(s1.contains(s2));
		
		
		//equals -- compare Strings - boolean - true/false
		
		String str1="swaroop";
		String str2="swaroop1";
		
		System.out.println(str1.equals(str2));
		
		//equalsIgnoreCase -- compare strings - it will ignore case
		//boolean - true/false
		
		String s3 = "SWAROOP";
		String s4 = "Swaroop";
		System.out.println(s3.equalsIgnoreCase(s4));
		
		//contentEquals - boolean - true/false 
		//- compares the two strings
		
		String s5 = "Swaroop";
		String s6 = "swaroop";
		System.out.println(s5.contentEquals(s6));
		
		
	}

}
