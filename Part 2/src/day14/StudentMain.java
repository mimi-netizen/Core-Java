package day14;

//Main method is in another class in same package
public class StudentMain {

	//main method - execution starting point
	public static void main(String[] args) {
		
		//object creation
		Student student1 = new Student();
		
		//define values for the variables
		student1.rollnum = 10;
		student1.name = "Alex";
		student1.grade = 'D';
		student1.address = "United States";
		
		//call methods
		student1.displayAllValues();
		student1.displayRollNum();	
		
		//Student2
		Student student2 = new Student();
		student2.rollnum = 20;
		student2.name = "John";
		student2.grade = 'B';
		student2.address = "United Kingdom";
		
		student2.displayAllValues();
		student2.displayRollNum();	
		
	}

}
