package day7;

public class Coding3 {

	public static void main(String[] args) {
		 //Count number of digits in a number
		// Input: 123123
		//Output: 6
		
		int num = 4567890;
		int count=0;
		while(num>0) {
			count++;
			num = num/10;
		}
		System.out.println(count);

	}

}
