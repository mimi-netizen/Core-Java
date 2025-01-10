package day21;

//Multiple Inheritance using Two Interfaces
public class TestClass implements Interface1, Interface2 {

	public static void main(String[] args) {
		TestClass obj = new TestClass();
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.method1();
		obj.method2();
	}

	@Override
	public void method2() {
		System.out.println("Method2 from Interface 2");
	}

	@Override
	public void method1() {
		System.out.println("Method1 from Interface 1");
	}

}
