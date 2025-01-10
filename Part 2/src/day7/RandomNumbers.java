package day7;

public class RandomNumbers {

	public static void main(String[] args) {
		
		// 0.0 to 1.0 - random value
		
		double d = Math.random();
		System.out.println(d);
		
		double d1 = Math.random();
		System.out.println(d1);
		
		// two digit value you want to generate which is double
		
		double twoDigit = Math.random()*1000;
		System.out.println(twoDigit);
		
		// int
		
		int num = (int) (Math.random()*100000);
		System.out.println(num);
	}
}
