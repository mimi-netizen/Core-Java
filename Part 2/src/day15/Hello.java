package day15;

public class Hello {
	
	//no variables
	
	//1) No input params, No return type
	void message1() {
		
		System.out.println("Swaroop");
		
	}
	
	//2) No input params, Return type
	
	int message2(){
		
		int a = 10;
		a++;
		
		return a;
	}
	
	//3) Has Input Params, No Return type
	void message3(String name)
	{
		System.out.println(name);
	}
	
	void message4(String name,int x) {
		
		System.out.println(name + " "+x);
	}
	
	//4) Has Input Params and has Return type
	
	String message5(String firstName, String lastName){
		
		return firstName + " " + lastName;
		
	}
	
	
}
