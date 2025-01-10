package day16;

public class OverloadMain {

	void main() { //no inputs
		
		System.out.println("No Inputs");
	}
	
	void main(String str) {
		//One String input
		System.out.println("String input: "+str);
	}
	
	void main(int x) {
		//One Int data type input
		System.out.println("int data type input: "+x);
	}
	
	void main(int x, int y){
		//two inputs
		
		System.out.println("X value is : "+x+ ", Y value is: "+y);
	}
	
	//execution starting point
	public static void main(String[] args) {
		
		OverloadMain obj = new OverloadMain();
		obj.main(); // no inputs
		obj.main(100); //int data type as input
		obj.main("Swaroop"); //String as input
		obj.main(100, 200);

	}

}
