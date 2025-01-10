package day10;

public class StringsExample7 {

	public static void main(String[] args) {
		
		String amount = "$12,34,567,123";
		
		System.out.println(amount.replace(",",""));
		System.out.println(amount.replace(",","").replace("$", ""));
		
		
	}

}
