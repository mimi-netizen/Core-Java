package packageDay14;

import day14.Student;

//Creating Object of Student in Another package
public class StudentAnotherPackageMain {

	//execution starting point
	public static void main(String[] args) {
		
		//Created object for student
		Student stu = new Student();
		
		//Defined values -- instance variables
		stu.rollnum = 100;
		stu.name = "Bill Gates";
		stu.grade = 'A';
		stu.address = "India";
		
		//calling the methods
		stu.displayAllValues();
		stu.displayRollNum();
		
	}

}
