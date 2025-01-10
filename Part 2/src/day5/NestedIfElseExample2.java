package day5;

public class NestedIfElseExample2 {

	public static void main(String[] args) {
		
		int age = 15;
		boolean hasLicense = true;
		
		//nested if else
		if(age >= 18) {
			if(hasLicense) {
				System.out.println("Eligible to drive vehicle");
			}
			else {
				System.out.println("Not Eligible as no License");
			}
		}
		else {
			System.out.println("You are NOT eligible to drive due to age criteria");
		}
	}

}
