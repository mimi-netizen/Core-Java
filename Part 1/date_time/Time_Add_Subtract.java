
package date_time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Time_Add_Subtract {

	public static void main(String[] args) {
		
		/*
		 * Plus / Minus
		 * ChronoUnit
		 */
		
	
		LocalTime t1 = LocalTime.now().plus(5, ChronoUnit.MINUTES);
		
		System.out.println(t1);

	}

}
