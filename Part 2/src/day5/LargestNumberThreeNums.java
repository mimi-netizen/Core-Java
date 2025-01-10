package day5;

public class LargestNumberThreeNums {

	public static void main(String[] args) {
		
		int a=1000,b=2000,c=3000;
		
		if(a>b && a>c) {
			System.out.println("a is the Largest value");
		}
		else if(b>a && b>c) {
			System.out.println("b is the Largest value");
		}
		else {
			System.out.println("c is the Largest value");
		}
	}

}
