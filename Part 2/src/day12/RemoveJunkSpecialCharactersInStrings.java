package day12;

public class RemoveJunkSpecialCharactersInStrings {

	public static void main(String[] args) {
		
		String str = "#@@&*@Java000 Strings423 #(*@Program@@*@*&))";
		
		//Regular expression
		
		//It has removed the Alphabets and Numbers
		String str1 = str.replaceAll("[a-zA-Z0-9]", "");
		System.out.println(str1);
		
		//this statement will remove non alphabets and numbers
		String str2 = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str2);
		
		//Retain only numbers
		String str3 = str.replaceAll("[^0-9]", "");
		System.out.println(str3);
		
		//Remove the numbers
		String str4 = str.replaceAll("[0-9]", "");
		System.out.println(str4);
		
		//Remove only alphabets
		String str5 = str.replaceAll("[a-zA-Z]", "");
		System.out.println(str5);
		
		//Retain only Alphabets
		String str6 = str.replaceAll("[^a-zA-Z]", "");
		System.out.println(str6);
		
		
	}

}
