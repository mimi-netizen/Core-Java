package day15;

public class HelloMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hello hello = new Hello();
		
		//calling the method
		//invoking the method
		
		//1) No Input params, No return type
		hello.message1();
		
		//2) No Input params, Return type
		int x = hello.message2();
		System.out.println(x);
		
		//3) Has Input params, No Return type
		hello.message3("SwaroopN");
		hello.message4("Welcome", 100);
		
		//4) Has Input params, Return type
		String fullName = hello.message5("Swaroop", "Nadella");
		System.out.println(fullName);
		
	}

}
