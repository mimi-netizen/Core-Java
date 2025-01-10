package day10;

public class StringsExample5 {

	public static void main(String[] args) {
		
		//substring() -- return an string
		//retrieve part of an main string
		
		//substring(index1) 
		//-- return string starting from index 1 to end of the String
		
		String str = "Swaroop";
		System.out.println(str.substring(2));
		
		String str1 = "Swaroop";
		System.out.println(str1.substring(0, 3));
		
		//to Upper case
		//to Lower case
		
		String str2 = "swaroop";
		String str3 = "SWAROOP";
		System.out.println(str2.toUpperCase());
		System.out.println(str3.toLowerCase());
	}

}
