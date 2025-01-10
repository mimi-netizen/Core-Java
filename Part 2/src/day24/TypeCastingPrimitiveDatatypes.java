package day24;

public class TypeCastingPrimitiveDatatypes {

	public static void main(String[] args) {

		// Upcasting - smaller --> larger value
		// int --> long
		int intvalue = 1000;
		long longvalue = intvalue; // automatically //assignation
		System.out.println(longvalue);

		// float --> double
		float floatvalue = 12.4f;
		double doublevalue = floatvalue; // automatically
		System.out.println(doublevalue);

		// Downcasting - larger --> smaller value
		// long --> int
		long longval = 10000;
		int intval = (int) longval; // manual
		System.out.println(intval);

		// double-->float
		double doubleval = 345.44;
		float floatval = (float) doubleval; // manual
		System.out.println(floatval);

		int intvalue1 = (int) doubleval;
		// manual and decimal points are removed
		System.out.println(intvalue1);

	}

}
