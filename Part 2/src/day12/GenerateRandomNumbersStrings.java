package day12;

import java.util.Random;

//import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumbersStrings {

	public static void main(String[] args) {
		
		//Approach1 - Random inbuilt class in Java
		
		Random random1 = new Random(); 
		
		int num = random1.nextInt(10); // 0 - 9
		System.out.println(num);
		
		/*
		int num1 = random1.nextInt(100); // 0 - 99
		System.out.println(num1);
		
		int num2 = random1.nextInt(1000); // 0 - 999
		System.out.println(num2);
		*/
		/*
		Double db = random1.nextDouble(); //0.0. to 1.0 - decimal values 
		System.out.println(db);
		*/
		
		//Approach 2 - Math.Random()
		
		//System.out.println(Math.random()); //0.0 to 1.0 - decimal value
		
		
		//Approach 3 - Apache commons lang api
		
		//String str= RandomStringUtils.randomNumeric(10);
		//System.out.println(str);
		
		//String randomString = RandomStringUtils.randomAlphabetic(15);
		//System.out.println(randomString);
		
	}

}
