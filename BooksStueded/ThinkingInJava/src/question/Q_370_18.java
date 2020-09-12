package question;

import java.util.*;
import lib.net.mindview.util.Generator;
import lib.generics.Generators;

class LittleFish{
	private static long counter = 1;
	private final long id = counter++;
	public String toString(){
		return "little " + id;
	}
	private LittleFish(){}
	public static Generator<LittleFish> generator(){
		return new Generator<LittleFish>(){
			public LittleFish next(){
				return new LittleFish();
			}
		};
	}
}

class BigFish{
	private static long counter = 1;
	private final long id = counter++;
	public String toString(){
		return "big " + id;
	}
	private BigFish(){}
	public static Generator<BigFish> generator = new Generator<BigFish>(){
		public BigFish next(){
			return new BigFish();
		}
	};
}

class Ocean{
	public static void serve( BigFish bigFish, LittleFish littleFish ){
		System.out.println( bigFish + " eat " + littleFish );
	}
}

public class Q_370_18{
	public static void main( String[] args ){
		Random rand = new Random();
		
		List<BigFish> bigList = new LinkedList<BigFish>();
		List<LittleFish> littleList = new LinkedList<LittleFish>();
		Generators.fill( bigList, BigFish.generator, 5 );
		Generators.fill( littleList, LittleFish.generator(), 20 );
		for( LittleFish l : littleList )
			Ocean.serve( bigList.get( rand.nextInt(bigList.size()) ), l );
	}
}
