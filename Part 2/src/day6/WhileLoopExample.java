package day6;

public class WhileLoopExample {

	public static void main(String[] args) {
		
		//Example 1: Print 1 to 10 - numbers - while loop
		/*
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i++; //i=i+1;
		}	*/
		
		//Example 2: Print Java message for 10 times
		/*
		int j=1;
		while(j<=10) {
			System.out.println("Java");
			j++;			
		} */
		
		//Example 3: Printing Odd numbers from 1 to 10
		/*
		int i=1;
		while(i<=10) {
			if(i%2==1) {
				System.out.println(i);
			}
			i++;
		} */
		
		//Example 4: Printing Even numbers from 1 to 10
		/*
				int i=1;
				while(i<=10) {
					if(i%2==0) {
						System.out.println(i);
					}
					i++;
				} */
				
		// Example 5: Print both odd and even numbers between 1 to 10
				/*
				int i=1; // Initialization
				while(i<=10) { //condition
					if(i%2==1) {
						System.out.println(i+ " Odd");
					}
					else {
						System.out.println(i+ " Even");
					}
					i++;
				} */
				
				// Example 6 - 1 to 10 - odd - 1 +2 = 3, + 2 = 5, + 2
				
		//Odd numbers
				int i=1;
				while(i<=10) {
					System.out.println(i);
					i+=2; // i=i+2;
				}
				
				//Even numbers
				int j=2;
				while(j<=10) {
					System.out.println(j);
					j+=2; // i=i+2;
				}
				
		
	}

}
