package question.lib;

import lib.net.mindview.util.Generator;

public class BerylliumSphere {
	private static long counter;
	private final long id = counter++;

	public String toString() {
		return "Sphere" + id;
	}

	public static Generator<BerylliumSphere> generator() {
		return new Generator<BerylliumSphere>() {
			public BerylliumSphere next() {
				return new BerylliumSphere();
			}
		};
	}
}
