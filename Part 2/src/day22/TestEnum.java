package day22;

public class TestEnum {

	public static void main(String[] args) {
		
		//System.out.println(Week.SUNDAY);
		
		//String str = Week.SUNDAY.toString();
		
		//Iterate all the values in the Enum
		for(Week day:Week.values()) {
			System.out.println(day);
		}
		
		//Retrieve the Index of Enum constants
		for(Week day:Week.values()) {
			System.out.println(day.ordinal());
		}
		
		System.out.println(Week.SATURDAY);

	}

}
