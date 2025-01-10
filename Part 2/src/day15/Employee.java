package day15;

public class Employee {

	// variables -instance variables
	int empId;
	String empName;
	double salary;
	
	

	/*
	Employee() { //automatically
		
		// Default Constructor - no input parameters
		System.out.println("Default Constructor");
		
		empId = 500;
		empName = "George";
		salary = 7000.89;
		
	} */
	
	//Parameterized Constructor
	Employee(int id, String name, double sal){
		
		empId = id;
		empName = name;
		salary = sal;
		
	}
	
	

	// Initialize values
	void setEmployeeData(int id, String name, double sal) {

		// local variables in the method memory
		// int id, String name, double sal

		empId = id;
		empName = name;
		salary = sal;

	}

	// user defined method
	void printEmployeeData() {

		System.out.println(empId + " " + empName + " " + salary);

	}

	// main method - execution will happen
	public static void main(String[] args) {

		// Employee employee1 = new Employee();

		// 1 - Approach1 - define some values to variables
		/*
		 * -- Using Object reference employee1.empId = 100; //int employee1.empName =
		 * "Swaroop"; //string employee1.salary = 5000.67; //double
		 */

		// 2 - Approach2 - define values using another method
		// using an method in the class
		// employee1.setEmployeeData(200,"Kumar",10000.99);

		// 3 - Using an Default Constructor - Initialize values
		//Employee emp1 = new Employee();
		
		// 4 - Parameterized Constructor - Initialize values
		//Employee emp1 = new Employee();
		Employee emp1 = new Employee(700,"Swaroop",1000.55);

		emp1.printEmployeeData();

	}

}
