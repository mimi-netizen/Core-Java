package day20;

class Base
{
	void m1(String str) {
		System.out.println(str);
	}
	
	void m2(String s) {
		System.out.println(s);
	}
	
}

class SubClass extends Base
{
	
	void m1(String str) { //Overriding
		System.out.println(str+" Child Class method");
	}
	
	void m2(String str1, String str2) { //Overloading
		System.out.println(str1+" "+str2);
	}
	
}

public class OverloadingVsOverriding {

	public static void main(String[] args) {
		
		SubClass obj = new SubClass();
		obj.m1("Swaroop"); 
		//Overridden method in the child class
		
		obj.m2("Nadella"); 
		//method from parent class
		
		obj.m2("Swaroop", "Nadella"); 
		//Overloading method in the child class
	}

}
