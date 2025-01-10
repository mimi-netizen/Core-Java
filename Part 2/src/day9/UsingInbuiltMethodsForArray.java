package day9;

import java.util.Arrays;

public class UsingInbuiltMethodsForArray {

	public static void main(String[] args) {
		
		//int arr[]= {10,20,30,11,23,44,32,50}; //unsorted
		//char ch[] = {'A','Z','B','R','C','E'}; //unsorted
		
		String s[] = {"java","python","csharp","cplusplus"};
		
		System.out.println("Before sorting: "+Arrays.toString(s));
		
		Arrays.sort(s); //Ascending order - alphabetical
		
		System.out.println("After sorting: "+Arrays.toString(s));
		
		
	}

}
