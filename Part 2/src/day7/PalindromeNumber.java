package day7;

public class PalindromeNumber {

	public static void main(String[] args) {
		//Palindrome Number
		int num = 12321;
		int temp = num;
		
		int remainder = 0;
		int reverse = 0;
		while(num>0) {
			remainder = num%10;
			reverse = reverse*10 + remainder;
			num = num/10; 
		}
		System.out.println(reverse);
		if(temp == reverse)
			System.out.println("Palindrome number");
		else
			System.out.println("Not Palindrome number");
		
		
	}
}
