package java_basics;

public class Loop_Break_And_Continue {

	public static void main(String[] args) {
		
		int a = 100;
		
		while (a > 50) {
			a-=5;
			if (a == 75) {
				continue;
			}
			System.out.println(a);
		}
		
	}

}

