class Test{
	Test(){
		System.out.print( "hello" );
	}
	Test( String str ){
		System.out.print( "hello" + str );
	}
}

public class Question_83_4{
	public static void main( String[] args ){
		Test t1 = new Test();
		Test t2 = new Test("simon");
	}
}