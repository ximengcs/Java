package question;

import java.util.Arrays;

import question.lib.BerylliumSphere;

public class Q_437_2 {

	public static BerylliumSphere[] randInt( int i ) {
		BerylliumSphere[] result = new BerylliumSphere[i];
		for( int a = 0; a < i; a++ )
			result[a] = new BerylliumSphere();
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println( Arrays.toString( randInt(4) ) );
	}
}
