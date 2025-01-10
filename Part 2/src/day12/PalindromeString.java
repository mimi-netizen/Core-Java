package day12;

public class PalindromeString {

	public static void main(String[] args) {
		
		//String str = "madam"; 
		//"refer","civic"
		String str = "Swaroop";
		System.out.println(str);
		
		String rev = ""; //Empty String
		
		for(int i=str.length()-1;i>=0;i--) {
			
			rev = rev + str.charAt(i);
			
		}
		System.out.println(rev);
		if(str.equals(rev)) {
			System.out.println("Palindrome String");
		}
		else {
			System.out.println("Not Palindrome String");
		}
		
	}

}
