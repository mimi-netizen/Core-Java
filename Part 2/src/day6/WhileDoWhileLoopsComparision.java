package day6;

public class WhileDoWhileLoopsComparision {

	public static void main(String[] args) {
		
		// Printing values from 1 to 10
		
		int i=100;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("---------------");
		
		int j=100;
		do  // atleast once before checking for the condition
		{
			System.out.println(j);
			j++;
		}while(j<=10);
		
	}

}
