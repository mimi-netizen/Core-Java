package day24;

class Parent {
	String name = "Swaroop";

	void method1() {
		System.out.println("Parent method");
	}

}

class Child extends Parent {
	int a = 100;

	void method2() {
		System.out.println("Child method");
	}

}

public class TypeCastingObjects {

	public static void main(String[] args) {

		Child ch = new Child(); // Child class object
		System.out.println(ch.name); // Parent
		ch.method1(); // Parent
		System.out.println(ch.a); // Child
		ch.method2(); // Child

		// Up Casting
		// Parent p = new Parent(); //Parent class object
		Parent p = new Child(); // automatic conversion
		System.out.println(p.name); // Parent
		p.method1(); // Parent
		// System.out.println(p.a); //Child
		// p.method2(); //Child

		// Down Casting
		Child c = (Child) new Parent(); // Manual casting with Child
		System.out.println(c.name);
		c.method1();
		System.out.println(c.a);
		c.method2();
	}

}
