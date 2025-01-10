package accessModifiers;

import day23.Test;

//public class TestMain extends Test { //protected example
public class TestMain
{
	public static void main(String[] args) {
		
		//Test obj = new Test();
		//obj.b; //default variable not visible outside package
		//obj.method1("Swaroop"); //default method not visible outside package
		
		/*
		TestMain object = new TestMain();
		System.out.println(object.d);
		object.method3("Swaroop","Nadella");
		*/
		
		Test object = new Test();
		System.out.println(object.d);
		object.method3("Swaroop", "N");

	}

}
