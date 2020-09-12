import java.util.*;
class Test{
	static Random rand = new Random();
	static final int NUM1 = rand.nextInt(100);
	final int NUM2 = rand.nextInt(100);
}
public class Question_142_18{
	public static void main( String[] args ){
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();

		System.out.println( t1.NUM1 );
		System.out.println( t1.NUM2 );
		System.out.println( t2.NUM1 );
		System.out.println( t2.NUM2 );
		System.out.println( t3.NUM1 );
		System.out.println( t3.NUM2 );
	}
}