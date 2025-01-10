package day6;

public class WhileLoopExample3 {

	public static void main(String[] args) {
		
		int i=1; // initialization
		while(true) { // uncertain condition - infinite loop
			System.out.println("Swaroop");
			
			if(i==7) {
				break; //jumping statement - loop is broken
			}
			
			i++;
		}
		System.out.println("After while loop");
	}

}
