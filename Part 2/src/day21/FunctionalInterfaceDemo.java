package day21;

@FunctionalInterface
interface FuncInterface
{
	void method(); //abstract method
	default void method2() {
		System.out.println("Default method1");
	}
	default void method3() {
		System.out.println("Default method2");
	}
	static void method4() {
		System.out.println("Static method1");
	}
	static void method5() {
		System.out.println("Static method2");
	}
}



public class FunctionalInterfaceDemo implements FuncInterface {

	public static void main(String[] args) {
		FunctionalInterfaceDemo obj = new FunctionalInterfaceDemo();
		obj.method();
		obj.method2();
		obj.method3();
		FuncInterface.method4();
		FuncInterface.method5();
		
	}

	@Override
	public void method() {
		System.out.println("Abstract method - Functional Interface");
	}

}
