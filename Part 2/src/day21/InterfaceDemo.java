package day21;

interface Book
{
	int numOfPages = 150; //final static variables
	String author = "Swaroop"; //final static
	
	void method1(); //abstract method
	default void method2() {
		System.out.println("Default method");
	}
	static void method3() {
		System.out.println("Static method");
	}
}

public class InterfaceDemo implements Book {

	@Override
	public void method1() {
		System.out.println("Abstract method code");
	}
	
	void method4(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		//Case1
		/*
		InterfaceDemo obj = new InterfaceDemo();
		obj.method1(); //Abstract method implemented
		obj.method2(); //default method of Interface
		//obj.method3(); //we cannot write like this
		
		Book.method3();  //static method of Interface
		//Using Interface we can call the static method
		 * 
		 */
		
		//Case2
		//Using the Interface reference to call the ChildClass object
		
		//Book bk = new Book(); 
		//not possible to create object for interface
		
		Book bk = new InterfaceDemo(); 
		//Child class object with Interface reference variable
		
		bk.method1();
		bk.method2();
		//bk.method3(); //not possible to call static method
		Book.method3();
		
		//bk.method4(); 
		//not possible to call the child class method with Interface reference
		
		InterfaceDemo obj1 = new InterfaceDemo();
		obj1.method4("SwaroopN");
	}	

}
