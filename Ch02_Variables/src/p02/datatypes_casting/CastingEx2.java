package p02.datatypes_casting;

public class CastingEx2 {

	public static void main(String[] args) {
		double d = 100.04;
		long l = (long) d;
		int i = (int) l;

		System.out.println("double value " + d);
		System.out.println("long value " + l);
		System.out.println("integer value " + i);
	}

}
