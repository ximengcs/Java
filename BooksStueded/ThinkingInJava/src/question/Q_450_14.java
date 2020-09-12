package question;

import java.util.Arrays;

import lib.net.mindview.util.ConvertTo;
import lib.net.mindview.util.CountingGenerator;
import lib.net.mindview.util.Generated;

public class Q_450_14 {

	public static void main(String[] args) {
		int[] t1 = ConvertTo.primitive( 
				Generated.array( Integer.class, new CountingGenerator.Integer(), 10 ) );
		System.out.println( Arrays.toString(t1) );
		
		short[] t2 = ConvertTo.primitive(
				Generated.array( Short.class, new CountingGenerator.Short(), 10 ) );
		System.out.println( Arrays.toString(t2) );
		
		long[] t3 = ConvertTo.primitive(
				Generated.array( Long.class, new CountingGenerator.Long(), 10 ) );
		System.out.println( Arrays.toString(t3) );
		
		byte[] t4 = ConvertTo.primitive(
				Generated.array( Byte.class, new CountingGenerator.Byte(), 10 ) );
		System.out.println( Arrays.toString(t4) );
		
		boolean[] t5 = ConvertTo.primitive(
				Generated.array( Boolean.class, new CountingGenerator.Boolean(), 10 ) );
		System.out.println( Arrays.toString(t5) );
		
		float[] t6 = ConvertTo.primitive(
				Generated.array( Float.class, new CountingGenerator.Float(), 10 ) );
		System.out.println( Arrays.toString(t6) );
		
		double[] t7 = ConvertTo.primitive(
				Generated.array( Double.class, new CountingGenerator.Double(), 10 ) );
		System.out.println( Arrays.toString(t7) );
		
		char[] t8 = ConvertTo.primitive(
				Generated.array( Character.class, new CountingGenerator.Character(), 10 ) );
		System.out.println( t8 );
	}
}
