package day11;

public class StringConstantPool {

	public static void main(String[] args) {
		
		String str = "Welcome";
		String str1 = "Welcome";
		String str2 = "Welcome";
		
		// All three String variables - point to same Welcome String constant
		//If Welcome constant not present in the String Constant pool, it gets added while executing str variable
		//str1 and str3 - will point to same constant and won't create new Constants.
		
		
		String str3 = new String("Welcome1");
		//Welcome1 is created in the Heap memory outside String Constant Pool		
		
	}

}
