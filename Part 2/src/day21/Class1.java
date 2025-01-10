package day21;

abstract class Test
{
	//static, non static variables and method
	//Abstract methods and non abstract methods
	abstract void method(); //abstract method
	void method2() {
		//non abstract method
	}
}


public class Class1 extends Test {

	public static void main(String[] args) {
		Class1 object = new Class1();
		object.method();

	}

	@Override
	void method() {
		System.out.println("Abstract method - Abstract class example");
	}

}
