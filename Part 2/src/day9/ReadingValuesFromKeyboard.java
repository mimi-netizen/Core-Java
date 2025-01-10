package day9;

import java.util.Scanner;

public class ReadingValuesFromKeyboard {

	public static void main(String[] args) {
		
		//int num=20;//Hardcoding
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Enter a number with decimal: ");
		//int num = sc.nextInt();
		//System.out.println(num+1);
		
		//double d = sc.nextDouble();
		//System.out.println(d+10);
		
		System.out.println("Enter a city: ");
		String city = sc.next();
		System.out.println("City is "+city);
		
		System.out.println("Enter a char value: ");
		String ch = sc.next();
		System.out.println(ch);
		
		
	}

}
