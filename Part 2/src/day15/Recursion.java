package day15;

public class Recursion {

	public static void main(String[] args) {
		
		int n = 10;
		printNumbers(n); //calling statement
			
	}
	
	public static void printNumbers(int x){
		
		if(x<1) //condition
			return;
		printNumbers(x-1); //calling statement
		System.out.println(x);
		return;
	}

}
