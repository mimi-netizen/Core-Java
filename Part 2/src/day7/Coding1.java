package day7;

public class Coding1 {

	public static void main(String[] args) {
		
		//Largest of two numbers
		//if else
		//Ternary operator ?:
		
		//if else
		
		int a=200, b=500;
		
		if(a>b)
			System.out.println(a + " is the Largest value");
		else
			System.out.println(b + " is the largest value");
		
		System.out.println("--------------------");
		
		//Ternary Operator ?:
		int x=100,y=500;
		
		int result = x>y ? x : y ;
		System.out.println(result);
		
		System.out.println("---------------------");
		//Check if an person eligible for vote based on the Age
		
		int age = 5;
		if(age>=18) {
			System.out.println("Person is eligible for voting");
		}
		else
			System.out.println("Person is not eligible for voting");
		
		System.out.println("--------------------------");
		
		int bmi = 22;
		if(bmi<20)
			System.out.println("underweight");
		else if(bmi>=20 && bmi < 25)
			System.out.println("Normal weight");
		else if(bmi>=25 && bmi < 30)
			System.out.println("Over weight");
		else
			System.out.println("Obesity");
		
		
	}

}
