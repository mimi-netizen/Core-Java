package day23;

public class CustomExceptionMain {

	public static void main(String[] args) throws Exception {
		
		//throw new Exception("Swaroop");
		try {
			int a = 100;
			if(a>50) {
				throw new TestException("Test");
			}
		}
		catch(TestException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
