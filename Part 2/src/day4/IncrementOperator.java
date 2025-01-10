package day4;

public class IncrementOperator {

	public static void main(String[] args) {
		
		// Increment Operator ++ 
		//increase by 1 and update it in the memory of the variable
		
		//example 1
		/*int a = 100;
		a++;
		//a=a+1; // 100 + 1
		System.out.println(a); */
		
		// Example 2
		int a = 200;
		int result = a++; // Post increment operation
		System.out.println(result); //200
		System.out.println(a);  // 201
		
		
		//Example 3
		/*
		int a = 500;
		int result = ++a; // Pre increment operation
		System.out.println(result); //501
		System.out.println(a); //501
		*/
	}

}
