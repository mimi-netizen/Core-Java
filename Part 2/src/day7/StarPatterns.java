package day7;

public class StarPatterns {

	public static void main(String[] args) {
		//Star Patterns
		
		/*
		int num=5;
		for(int i=1;i<=num;i++) //rows
		{
			for(int j=1;j<=num;j++) { //columns
				
				System.out.print("*");
			}
			System.out.println("");
		}
		
		*****
		*****
		*****
		*****
		*****
		
		*/
		
		/*
		//Left Triangle Star Patterns
		int num=5;
		for(int i=1;i<=num;i++) //rows
		{
			for(int j=1;j<=i;j++) { //columns
				
				System.out.print("*");
			}
			System.out.println("");
		}
		
		*
		**
		***
		****
		*****
		
		*/
		
		/*
		int num=5;
		for(int i=0;i<=num;i++) //rows
		{
			for(int j=num-i;j>=1;j--) { //columns
				
				System.out.print("*");
			}
			System.out.println("");
		}
		
		*****
		****
		***
		**
		*
		
		*/
		
		
		// Normal left triangle + Invested left triangle
		int num=5;
		for(int i=1;i<=num;i++) //rows
		{
			for(int j=1;j<=i;j++) { //columns
				
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i=0;i<=num;i++) //rows
		{
			for(int j=num-i;j>1;j--) { //columns
				
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//Output
		
		/*
		 
*
**
***
****
*****
****
***
**
*
		 
		 */
		
	}

}
