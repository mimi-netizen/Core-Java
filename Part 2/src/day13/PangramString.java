package day13;

public class PangramString {

	public static void main(String[] args) {
		
		String str = "The quick brown fox jumps over the lazy dog"; 
		
		//String str = "The quick brown jumps over the lazy dog"; 
		//String str = "Swaroop";
		int flag = 1; //It is Pangram - assumption
		// all 26 alphabets
		
		str = str.toLowerCase(); //Convert to Lowercase
		
		if(str.length()<26) {
			
			System.out.println(str + " is not Pangram String");
		}
		else {
			
			for(char ch='a';ch<='z';ch++) { //ascii code - numbers
				
				if(str.indexOf(ch)<0) { 
					//one alphabet is missing - not Pangram
					flag = 0;
					//Not a Pangram String
				}
				
			}
			if(flag == 1)
				System.out.println(str + " is an Pangram String");
			else {
				System.out.println(str + " is Not a Pangram String");
			}
		}
	}

}
