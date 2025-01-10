package day19;

//Hierarchial Inheritance
class Parent{
	
	int a = 20;
	void display() {
		System.out.println("Parent method");
	}
	
}

class Child1 extends Parent
{
	int b = 40;
	void print() {
		System.out.println("Child 1 method");
	}
}

class Child2 extends Parent
{
	int c = 60;
	void present() {
		System.out.println("Child 2 method");
	}
}

public class HierachialInheritance {

	public static void main(String[] args) {
		
		Child1 ch1 = new Child1(); //Child1 object
		System.out.println(ch1.a); //Parent
		ch1.display(); //Parent
		System.out.println(ch1.b); //Child1
		ch1.print(); //Child1
		
		Child2 ch2 = new Child2(); //Child2 object
		System.out.println(ch2.a); //Parent
		ch2.display(); //Parent
		System.out.println(ch2.c); //Child2
		ch2.present(); //Child2
		
	}

}
