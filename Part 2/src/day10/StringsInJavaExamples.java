package day10;

public class StringsInJavaExamples {

	public static void main(String[] args) {
		
		//Approach1
		String str = "Swaroop";
		System.out.println(str);
		
		//Approach2
		String str1 = new String("SwaroopN");
		System.out.println(str1);
		
		//inbuilt methods - String class
		//length() - return number of characters in the given string
		
		int len = str.length();
		System.out.println(len); //7
		System.out.println(str1.length()); //8
		
		int length1 = "SwaroopNadella".length();
		System.out.println(length1); //14
		
		//concat - Concatenation - it will join two strings
		String s1 = "Swaroop";
		String s2 = "Nadella";
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		String s3 = "Academy";
		System.out.println("using + :"+s1+s2+s3);
		System.out.println("using concat method :"+s1.concat(s2).concat(s3));
			
		
		
	}

}
