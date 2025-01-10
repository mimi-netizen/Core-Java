package day7;

public class Coding2 {

	public static void main(String[] args) {
		//Reverse of a Number
		int num = 12345;   //54321 - 5 times
		int remainder = 0;
		int reverse = 0;
		while(num>0) {
			remainder = num%10;
			reverse = reverse*10 + remainder;
			num = num/10; 
		}
		System.out.println(reverse);
		
		
	}
}
