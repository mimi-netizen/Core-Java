package day15;

public class ConstructorDemo {
	
	//variables
	int a;
	int b;
	
	ConstructorDemo(){ //Default Constructor
		a = 100;
		b = 200;
	}
	
	ConstructorDemo(int x, int y){ //Parameterized Constructor
		a = x;
		b = y;
	}
	
	void sum(){
		System.out.println(a+b);
	}
	
	//main method - execution
	public static void main(String[] args) {
		
		//Default Constructor
		ConstructorDemo cd1 = new ConstructorDemo();
		cd1.sum(); //calling statement
		
		//Parameterized Constructor
		ConstructorDemo cd2 = new ConstructorDemo(10,700);
		cd2.sum(); //calling statement
		
	}

}
