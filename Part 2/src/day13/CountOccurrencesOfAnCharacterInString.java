package day13;

public class CountOccurrencesOfAnCharacterInString {

	public static void main(String[] args) {
		
		String str = "Java Strings Programs Example Java Java";
		
		int len = str.length(); //length of the String
		
		int temp = str.replace("J", "").length();
		//all the a will replaced with empty
		
		int count = len - temp; //this will count of a occurrences
		System.out.println(count);
		
	}

}
