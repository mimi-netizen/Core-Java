package super_keyword;

public class B extends A{

	int num1 = 200;
	
	public void doThis() {
		System.out.println("Do This From B");
	}
	
	public void xyz() {
		System.out.println(num1);
		super.doThis();
		System.out.println("XYZ Executed");
	}
	
}

