package day22;

public class Test {

	/*
	private int x = 100;
	
	private void method() {
		System.out.println("Method in the Test Class");
	} */
	
	//default - within same class, other class in same package
	/*int x = 1000;
	void method() {
		System.out.println("Method - default access modifier");
	} */
	
	public int x=500;
	public void method() {
		System.out.println("Method - public access modifier");
	}
	
	public static void main(String[] args) {
		Test obj1 = new Test();
		System.out.println(obj1.x);
		obj1.method();
	}
}
