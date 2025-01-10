package day17;

public class ThisKeyword {

	//variables
	int x, y; // Instance variables - mapped to Object memory
	
	/*
	ThisKeyword(int x, int y){ //Parameterized Constructor
		// a and b are Local variables
		this.x=x;
		this.y=y;
		
		//Initialize the variable values
	}
	*/
	
	
	//methods
	void setData(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}
	
	void display() {
		System.out.println(x);
		System.out.println(y);
	}
	
	
	public static void main(String[] args) {
		
		ThisKeyword th = new ThisKeyword();
		th.setData(500, 1000);
		th.display();
		
	}

}
