package day18;

public class MyClass {
	
	//static variable
	static int counter = 0;
	
	//non static variable - instance variable
	int instanceNumber = 0;
	
	//Default Constructor
	MyClass(){
		counter++;
		instanceNumber++;
	}
	
	//static method
	static void displayCounter() {
		System.out.println("static variable counter: "+counter);
		
		//inside static method
		//no need of object for static members
		int c = MyClass.counter;
		MyClass.display();
		
		//inside static method - 
		//calling non static members needs object creation
		MyClass obj = new MyClass();		
		int d = obj.instanceNumber;
		obj.displayInstanceNumber();
	}
	
	//static method
	static void display() {
		System.out.println("static display method");
	}
	
	//non static method
	void display_nonstatic() {
		
		System.out.println("non static method");
		int count = counter;
		displayCounter();
		
		int d = instanceNumber;
		displayInstanceNumber();
		
		
	}
	
	//non static method - instance method
	void displayInstanceNumber() {
		System.out.println("instance variable: "+instanceNumber);
	}
	
	//execution point - JVM
	public static void main(String[] args) {
		
		MyClass obj1 = new MyClass(); //First object
		
		displayCounter();
		int c = counter;
		obj1.displayInstanceNumber(); //non static method
		int x = obj1.instanceNumber;
		
		MyClass obj2 = new MyClass(); //Second object
		
		displayCounter();
		obj2.displayInstanceNumber();
		
		
	}

}
