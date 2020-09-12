class Test{
	Test( String str ){
		System.out.println( str );
	}
}
public class Question_101_17{
	public static void main( String[] args ){
		Test[] t = new Test[]{
			new Test( "a" ),
			new Test( "b" ),
			new Test( "c" ),
		};
	}
}