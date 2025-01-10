package day24;

class A {

}

class B extends A {

}

class C extends B {

}

public class TestClass {

	public static void main(String[] args) {
		A a = new A(); // valid
		B b = new B(); // valid
		C c = new C(); // valid

		A a1 = new B(); // valid - automatic conversion
		A a2 = new C(); // valid - automatic conversion

		B b1 = new C(); // valid
		B b2 = (B) new A(); // manual process

	}

}
