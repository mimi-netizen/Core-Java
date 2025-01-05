package java_basics;


public class LogicalAndBitwiseOperators {

	public static void main(String[] args) {
		
		/*
		 * 
		 * Logical AND - &&
		 * 
		 * Logical OR - ||
		 * 
		 * Logical Not - !
		 * 
		 * Bitwise And - &
		 * 
		 * Bitwise Or - |
		 * 
		 * Bitwise Compliment - ~
		 * 
		 * 
		 * 
		 * 
		 */
		
		int num1 = 60; //111100 => 000011
		int num2 = 42; //101010
		               //101000 => 40
		               //111110 => 62
		
		System.out.println(num1 | num2);
		
		System.out.println(~num1);
	}

}

