package day23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		
		System.out.println("Start of the Program");
		System.out.println("Statement1");
		
		Thread.sleep(5000);
		//FileInputStream file = new FileInputStream("C:\\Test.txt");
		
		System.out.println("Statement2");
		System.out.println("End of the program");

	}

}
