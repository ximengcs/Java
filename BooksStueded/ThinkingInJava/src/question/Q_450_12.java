package question;

import java.util.Arrays;

import lib.net.mindview.util.ConvertTo;
import lib.net.mindview.util.Generated;
import lib.net.mindview.util.RandomGenerator;

public class Q_450_12 {

	public static void main(String[] args) {
		double[] test = ConvertTo.primitive( 
				new Generated().array( Double.class, new RandomGenerator.Double(), 10 ) );
		System.out.println( Arrays.toString( test ) );
	}
}
