package day19;

class Parent1{
	
}

class Parent2{
	
}

class Child 
//extends Parent1,Parent2  
//Multiple Inheritance-- Not supported with classes in Java
{
	void display() {
		System.out.println("Welcome");
	}
	void display1() {
		System.out.println("Display method 2");
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {

		Child obj = new Child();
		obj.display();
		obj.display1();

	}

}
