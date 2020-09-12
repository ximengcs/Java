class TestOne{
	public final void print(){
		System.out.println( "TestOne.print" );
	}
}
class TestTwo extends TestOne{
	public final void print(){
		System.out.println( "TestTwo.print" );
	}
}
public class Question_144_21{
	public static void main( String[] args ){
		TestTwo t = new TestTwo();
	}
}