package day12;

import java.util.Arrays;

public class ReverseAlphabetsAloneInString {

	public static void main(String[] args) {
		
		String str = "abc123pqr45xyz";
		System.out.println(str);
		//Output - "zyx123rqp45cba"
		
		int left = 0;
		int right = str.length()-1;
		
		char ch[] = str.toCharArray(); 
		//convert String into charArray
		
		while(left<right) {
			if(Character.isDigit(ch[left])) { 
				left++;
			}
			else if(Character.isDigit(ch[right])) {
				right--;
			}
			else { //swapping values
				char temp = ch[left];
				ch[left] = ch[right];
				ch[right] = temp;
				left++;
				right--;
			}
		}
		System.out.println(new String(ch));
		System.out.println(Arrays.toString(ch));
		
	}

}
