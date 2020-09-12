class TestOne{
	public TestOne( int num ){
		System.out.println( "num = " + num );
	}
}
class TestTwo{
	TestOne getTestOne(){
		return new TestOne( 1 );
	}
}
public class Question_199_15{
	public static TestOne get(){
		return new TestOne(1){};
	}
	public static void main( String[] args ){
		TestOne t = get();
	}
}