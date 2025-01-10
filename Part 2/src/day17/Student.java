package day17;

public class Student {

	//variables
	int rollnum;
	char grade;
	static String city="Delhi";
	
	//methods
	static void display1() {
		
		System.out.println("static display method");
		
	}
	
	void display2() {
		System.out.println("non static method");
	}	
	
	//execution point
	/*
	public static void main(String[] args) {
		
		//object creation is not required 
		//for calling static variables and methods
		System.out.println(city);
		display1();
		
		Student stu = new Student();
		System.out.println(stu.rollnum);
		stu.grade = 'A';
		System.out.println(stu.grade);
		stu.display2();
		System.out.println(city);
		display1();

	}
	*/

}
