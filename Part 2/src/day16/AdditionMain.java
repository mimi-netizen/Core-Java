package day16;

public class AdditionMain {

	//Execution starts in the main method
	public static void main(String[] args) {
		
		Addition obj = new Addition(); // create obj object
		
		obj.sum(); //1
		obj.sum(100.5, 50); //4
		obj.sum(50, 15.7); //3
		obj.sum(50,60); //2
		obj.sum(10,20,30); //5
		
	}

}
