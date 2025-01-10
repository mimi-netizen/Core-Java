package day13;

public class StringConcatenationArithmeticOperations {

	public static void main(String[] args) {
		
		System.out.println("java"+10+20); //concatenation
		System.out.println(10+20+"java"); //addition + concatenation
		System.out.println(10+20+"java"+30+40);//addition + concatenation
		
		//Arithmetic Operators :  + - * / %
		System.out.println("java"+(100-200)); //concatenation+substraction
		System.out.println(100-50+"java"+(100-20));
		
		System.out.println("java"+10*20);
		System.out.println(30*40+"java"+10*20);
		System.out.println(50*100+"Java");
		
		System.out.println(50/100+"Java");
		System.out.println(500/100+"java"+40/20);
		System.out.println("java"+40/20);
		
		System.out.println(302%100+"java");
		System.out.println(302%100+"java"+500%200);
		System.out.println("java"+405%20);
		
	}

}
