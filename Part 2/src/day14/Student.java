package day14;

public class Student {

	//variables --
	public int rollnum;
	public String name;
	public char grade;
	public String address;	
	
	//methods
	public void displayAllValues(){
		
		System.out.println(rollnum);
		System.out.println(name);
		System.out.println(grade);
		System.out.println(address);
		
	}
	
	public void displayRollNum() {
		
		System.out.println("RollNum value is : "+rollnum);
	}
	
	// method - main method is the execution starting point
	/*
	public static void main(String[] args) {
		
		//creating an object
		Student stu1 = new Student();
		
		//assigned some values to variables in the run time
		stu1.rollnum = 1;
		stu1.name = "Swaroop";
		stu1.grade = 'A';
		stu1.address = "India";
		
		//System.out.println(stu1.rollnum);
		
		//call methods
		stu1.displayAllValues();
		stu1.displayRollNum();
		
		Student stu2 = new Student();
		
		//assigned some values to variables in the run time
		stu2.rollnum = 2;
		stu2.name = "Kumar";
		stu2.grade = 'B';
		stu2.address = "Australia";
				
		//call methods
		stu2.displayAllValues();
		stu2.displayRollNum();
		
	}
	
	*/
}
