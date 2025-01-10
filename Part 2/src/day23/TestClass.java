package day23;

public class TestClass {

	public static void main(String[] args) {
		
		Test obj = new Test();
		//obj.a; //private variable not visible outside class
		//obj.method(); //private method not visible outside class
		
		System.out.println(obj.d);
		obj.method3("Swaroop","Nadella");
		
	}

}
