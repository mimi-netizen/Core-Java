package day11;

public class StringComparisions {

	public static void main(String[] args) {
		
		/*
		//Example1 - String Constant Pool
		String str1 = "Welcome"; //String constant or String literal
		String str2 = "Welcome";
		
		System.out.println(str1==str2); //boolean
		System.out.println(str1.equals(str2)); //boolean
		*/
		
		/*
		//Example2 -- Heap Memory - outside the String Constant Pool
		String s1 = new String("Swaroop");
		String s2 = new String("Swaroop");
		
		System.out.println(s1==s2); //boolean
		System.out.println(s1.equals(s2)); //boolean
		*/
		
		/*
		//Example3 -- 
		String str1 = "Welcome";  //String constant or literal
		//SCP - String Constant pool
		
		String str2 = new String("Welcome"); 
		//Heap memory - outside SCP
		
		System.out.println(str1==str2); 
		//boolean     == compare objects
		
		System.out.println(str1.equals(str2)); 
		//boolean   equals compare values
		
		*/
		
		/*
		//Example 4
		String s1 = "Welcome"; //SCP
		String s2 = new String("Welcome"); //heap memory object
		String s3 = s2; //Heap memory object - S2
		
		System.out.println(s1==s2); //boolean
		System.out.println(s1.equals(s2)); //boolean
		
		System.out.println(s1==s3); //false
		System.out.println(s1.equals(s3)); //true
		
		System.out.println(s2==s3); //true
		System.out.println(s2.equals(s3)); //true
		*/
		
		System.out.println("------------------");
		//intern() 
		
		String s1 = "Swaroop"; //SCP
		String s2 = "Swaroop"; //SCP
		
		String s3 = new String("SwaroopNadella"); 
		//HEAP Memory - outside SCP
		
		s3 = s3.intern();
		
		String s4 = s3.intern();
		//It will add to the Constant to the SCP
		
		
	}

}
