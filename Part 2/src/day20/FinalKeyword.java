package day20;

final class TestClass
{
	final int a = 1000; //Constant
	
	final void display() {
		System.out.println("Parent Display method");
	}
}

class Child 
//extends TestClass 
//Not possible to extend final class into the Child class
{
	/*void display() { //Overriding final is not possible
		System.out.println("Child display method");
	}*/
}

public class FinalKeyword {

	public static void main(String[] args) {
		
		//TestClass obj = new TestClass();
		//System.out.println(obj.a);
		//obj.a = 2000; //compile time error
		//System.out.println(obj.a);
		//Child object = new Child();
		//object.display();
		
		
	}

}
