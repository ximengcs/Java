package question;

import java.util.Arrays;

import lib.arrays.ContainerComparison;
import lib.net.mindview.util.ConvertTo;
import lib.net.mindview.util.Generated;
import lib.net.mindview.util.Generator;
import question.lib.BerylliumSphere;

class GeneratorBerylliumSphere implements Generator<BerylliumSphere> {
	public BerylliumSphere next() {
		return new BerylliumSphere();
	}
}

public class Q_450_15 extends ContainerComparison {

	public static void main(String[] args) {
		BerylliumSphere[] test = 
				Generated.array( BerylliumSphere.class, new GeneratorBerylliumSphere(), 10 );
		
		System.out.println( Arrays.toString(test) );
	}
}
