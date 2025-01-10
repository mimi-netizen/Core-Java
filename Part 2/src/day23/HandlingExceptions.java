package day23;

import java.util.Scanner;

public class HandlingExceptions {

	public static void main(String[] args) {

		try {
			System.out.println("Start of the program");
			Scanner sc = new Scanner(System.in);
			
			//Example1
			System.out.println("Enter an Number:");
			int num = sc.nextInt();
			System.out.println(1000/num);
			
			sc.close();
			System.out.println("End of the program");
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException Catch block");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException Catch block");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("Exception catch block");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Finally block statements");
		}

	}

}
