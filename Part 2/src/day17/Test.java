package day17;

public class Test {
	
	Test(){  //1
		
		System.out.println("default constructor");
	}
	
	Test(String str){ //2
		this(); //calling 1
		System.out.println(str);
	}
	
	Test(String str, int x){ //3
		this("Testing"); //calling 2
		System.out.println(str + " "+x);
	}
	
	
	public static void main(String[] args) {
		
		Test obj = new Test("Swaroop",100);
		
	}

}
