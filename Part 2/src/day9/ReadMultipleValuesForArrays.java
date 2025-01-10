package day9;

import java.util.Arrays;
import java.util.Scanner;

public class ReadMultipleValuesForArrays {

	public static void main(String[] args) {
		
		int a[] = new int[5]; //variable declaration
				
		Scanner sc = new Scanner(System.in); //object creation
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println("Enter a number: ");
			a[i] = sc.nextInt();
		}
		
		System.out.println("Arrays value: "+Arrays.toString(a));
		
	}

}
