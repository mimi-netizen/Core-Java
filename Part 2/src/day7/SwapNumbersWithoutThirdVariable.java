package day7;

public class SwapNumbersWithoutThirdVariable {

	public static void main(String[] args) {
		
		//swap 2 numbers without using 3rd variable
		
		int a=10,b=50;
		
		a = a+b; //60
		b = a-b; //10
		a = a-b; //50
		
		System.out.println("Swapped Numbers: "+"a: "+a+" b: "+b);
		
	}

}
