package day23;

public class Test {

	/*private int a = 100; //private variable
	private void method() { //private method
		System.out.println("Test method");
	}*/
	
	/*
	int b = 200; //default variable
	void method1(String str) { //default method
		System.out.println(str);
	} */
	
	/*
	protected int c = 300;
	protected void method2(String str) {
		System.out.println(str);
	}*/
	
	public int d = 400;
	public void method3(String str1, String str2) {
		System.out.println(str1+str2);
	}
		
	public static void main(String[] args) {
		
		Test object = new Test();
		System.out.println(object.d);
		object.method3("Swaroop","Nadella");

	}

}
