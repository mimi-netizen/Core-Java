package day6;

public class ForLoopExample {

	public static void main(String[] args) {
		
		//For Loop example - Print values from 1 to 10
		/*
		for(int i=1;i<=10;i++) {
			
			System.out.println(i);
		} */
		
		//For Loop example - Print values from 10 to 1
		/*
				for(int i=10;i>=1;i--) {
					
					System.out.println(i);
				}
				*/
				
		/*
				//Odd Numbers
				for(int i=1;i<=10;i+=2) { 
					System.out.println(i);
				}
				System.out.println("-----------------");
				//Even Numbers
				for(int j=2;j<=10;j+=2) {
					System.out.println(j);
				}
				
				*/
		
		//Odd and Even numbers - For loop
		
		for(int i=1;i<=10;i++) {
			if(i%2==1) {
				System.out.println(i+ " Odd");
			}
			else {
				System.out.println(i+" Even");
			}
		}
				
				
				
		
		
	}

}
