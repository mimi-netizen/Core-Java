package day12;

public class RemoveWhiteSpacesInStrings {

	public static void main(String[] args) {
		String str = "    S w  ar oo  p Na del la Ac ad em   y";
		
		str = str.replaceAll("\\s", ""); 
		//remove all the spaces in the String
		System.out.println(str);
	}

}
