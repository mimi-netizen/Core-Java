package day13;

public class ReverseEachWordInAString {

	public static void main(String[] args) {
		
		String str = "Swaroop Nadella Academy";
		//String str = "Java Strings program to Reverse Words";
		System.out.println(str);
		//Output String:  poorawS alledaN ymedacA
		
		String words[] = str.split(" ");
		//splitting the String into words
		
		String ReverseString = ""; //Empty String
		
		for(String w:words) { 
			//Enhanced For loop for Array navigation
			
			String reverseWord = ""; //Empty String
			for(int i=w.length()-1;i>=0;i--) {
				
				reverseWord = reverseWord + w.charAt(i);
				//Reverses each words character by character
			}
			
			ReverseString = ReverseString + reverseWord + " ";
		}
		System.out.println(ReverseString);
	}

}
