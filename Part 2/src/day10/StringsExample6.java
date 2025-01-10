package day10;

import java.util.Arrays;

public class StringsExample6 {

	public static void main(String[] args) {
		
		//split - it will create multiple String based on delimiter
		
		String str = "Swaroop Nadella Academy";
		
		String s[] = str.split(" ");
		System.out.println(Arrays.toString(s));
		System.out.println(s[0]);
		System.out.println(s[1]);
		
		System.out.println(Arrays.toString(s));
		
		
		String str2 = "test12345@gmail.com";
		String s2[] = str2.split("@");
		System.out.println(Arrays.toString(s2));
		
		String amount = "$1,23,456";
		String s3[] = amount.split(",");
		System.out.println(Arrays.toString(s3));
		System.out.println(s3[2]);
		
		
	}

}
