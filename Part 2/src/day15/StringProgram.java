package day15;

public class StringProgram {

	public static void main(String[] args) {
		
		String str = "AuToMation";
		System.out.println(str);
		//output is ATM
		
		//str = str.replaceAll("[a-z]", "");
		//str = str.replaceAll("[^A-Z]", "");
		
		String result = "";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				result = result+ch;
			}
		}
		System.out.println(result);
	}

}
