class Test{
	final int code;
	Test(){
		code = 1;
	}
	Test( int i ){
		code = i;
	}
}
public class Question_142_19{
	public static void main( String[] args ){
		Test t1 = new Test();
		Test t2 = new Test(9);
		System.out.println( t1.code );
		System.out.println( t2.code );
	}
}