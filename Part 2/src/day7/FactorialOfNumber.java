package day7;

public class FactorialOfNumber {

	public static void main(String[] args) {
		//Factorial -- 5 :   5*4*3*2*1 -- 120
		
		int num=5;
		int factorial = 1;
		for(int i=1;i<=num;i++) {
			factorial = factorial*i;
		}
		System.out.println(factorial);
		
		
		
	}

}
