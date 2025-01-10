package day20;

class Car
{
	int speed = 100;
	
	Car(){
		System.out.println("Car class - Default Constructor");
	}
	
	void accelerate() {
		System.out.println("Accelerate method in the Parent class");
	}
}

class BMW extends Car
{
	int speed = 150; //overridden variable
	
	BMW(){
		super();
		//System.out.println("BMW Default Constructor");
	}
	void displaySpeed() {
		//System.out.println(speed); //Child class variable
		System.out.println(super.speed); 
		//Immediate parent class variable
	}
	
	void accelerate() { //Overriden method
		//System.out.println("Accelerate method in the Child class");
		super.accelerate();
		//Immediate parent class method
	}
}


public class SuperKeyword {

	public static void main(String[] args) {
		
		BMW obj = new BMW();
		obj.displaySpeed();
		obj.accelerate();
	}

}
