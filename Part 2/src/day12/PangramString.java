package day12;

public class PangramString {

	public static void main(String[] args) {
		
		String str = "The quick brown fox jumps over the lazy dog";
		int flag = 1; //pangram string
		if(str.length()<26) {
			System.out.println(str+" is not Pangram String");
		}
		else {
			
			for(char ch='a';ch<='z';ch++) { //Ascii code are numbers
				
				if(str.indexOf(ch)<0) {
					flag = 0; //non alphabet
					
				}
				
			}
			
			if(flag == 1)
				System.out.println("Pangram string");
			else {
				System.out.println("Not Pangram String");
			}
			
			
		}

		
		
	}

}
