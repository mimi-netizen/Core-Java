package day11;

import java.util.Arrays;

public class MutableVsImmutableObjects {

	public static void main(String[] args) {
		/*
		//mutable - we can change the value
		int arr[] = {11,20,8,9,3,45,88,55,77,34}; //unsorted
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr); //sorting in the memory
		System.out.println(Arrays.toString(arr)); //sorted array
		*/
		
		
		//immutable - we cannot change the value in the memory
		String str = new String("Welcome");
		System.out.println(str);
		
		//String str2 = str.concat("to Java Strings");
		str.concat("to Java Strings");
		System.out.println(str); //original value
		//System.out.println(str2); //concatenation
		
		
		/*
		//mutable - we can change the value in the memory
		StringBuffer sb = new StringBuffer("Welcome");
		System.out.println(sb);
		
		sb.append("to Java Strings");
		System.out.println(sb); //value has changed
		
		//mutable - we can change the value in the memory
		StringBuilder str = new StringBuilder("Swaroop");
		System.out.println(str);
		
		str.append("Nadella");
		System.out.println(str);
		
		*/
		
	}

}
