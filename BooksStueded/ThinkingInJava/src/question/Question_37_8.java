class StaticTest{
	static int i = 520;
}
public class Question_37_8{
	public static void main( String[] args ){
		StaticTest s1 = new StaticTest();
		StaticTest s2 = new StaticTest();
		StaticTest s3 = new StaticTest();
		StaticTest s4 = new StaticTest();
		StaticTest s5 = new StaticTest();
		
		System.out.print( s1.i );
		System.out.print( s2.i );
		System.out.print( s3.i );
		System.out.print( s4.i );
		System.out.print( s5.i );
		
		s1.i++;
		
		System.out.println();
		System.out.print( s1.i );
		System.out.print( s2.i );
		System.out.print( s3.i );
		System.out.print( s4.i );
		System.out.print( s5.i );
	}
}