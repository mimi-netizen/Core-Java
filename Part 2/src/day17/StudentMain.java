package day17;

public class StudentMain {

	public static void main(String[] args) {
		//object creation is not required 
		//for calling static variables and methods
		System.out.println(Student.city);
		Student.display1();
				
		Student stu1 = new Student(); 
		//object creation is required for non static variables 
		//and methods
		stu1.rollnum = 101;
		System.out.println(stu1.rollnum);
		stu1.grade = 'A';
		System.out.println(stu1.grade);
		stu1.display2();
		System.out.println(stu1.city);
		stu1.display1();
		
		Student stu2 = new Student();
		System.out.println(stu2.city);
		stu2.display1();
	}

}
