package day19;

//Single Inheritance
class A{ //Parent
	
	int a = 10;
	void display() {
		System.out.println(a);
	}
}

class B extends A
{ //Child
	int b = 20;
	void print() {
		System.out.println(b);
	}
}

public class InheritanceDemo {
	
	public static void main(String[] args) {
		
		A objA = new A(); //object creation for class A
		System.out.println(objA.a);
		objA.display();
		
		B objB = new B();
		System.out.println("Variable a:"+objB.a); //class A
		System.out.println("Variable b:"+objB.b); //class B
		objB.display(); //class A
		objB.print(); //class B

	}

}
