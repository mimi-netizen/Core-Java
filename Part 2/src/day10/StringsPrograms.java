package day10;

public class StringsPrograms {

	public static void main(String[] args) {
		
		String S1 = "Java"+10+20+30+40; 
		System.out.println(S1);
		String S2 = 10+20+"Java"+30+40; 
		System.out.println(S2);
		String S3 = 10+"20"+30+40+"50"+60+70;
		System.out.println(S3);
		String S4 = 10+20+"Java"+30+40+50+"Good"+60+70+80;
		System.out.println(S4);
		String S5 = "Java"+20+30+"Good";
		System.out.println(S5);
		String S6 = "Java"+(20+30)+"Good";
		System.out.println(S6);
		String S7 = "Java"+(10+20+30+40);
		System.out.println(S7);
		
		
	}

}
