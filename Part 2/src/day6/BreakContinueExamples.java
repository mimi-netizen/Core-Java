package day6;

public class BreakContinueExamples {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			
			if(i==6)
				break; // Loop is broken and it will end
			
			System.out.println(i);
		}
		System.out.println("End of For loop");
		
		for(int j=1;j<=10;j++) {
				
			if(j==2 || j==5 || j==8)
				continue; // the code below is skipped
			
			System.out.println(j);
		}
		
		
		
		
	}

}
