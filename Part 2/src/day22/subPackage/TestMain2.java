package day22.subPackage;

import day22.Test;

public class TestMain2 extends Test {

	public static void main(String[] args) {
		Test obj = new Test();
		System.out.println(obj.x);
		obj.method();
		
		//obj.x; //default not visible in another package
		//obj.method(); //not visible

	}

}
