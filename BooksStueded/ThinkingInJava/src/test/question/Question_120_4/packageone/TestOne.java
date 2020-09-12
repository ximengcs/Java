//package packageone;
public class TestOne{
	private int i;
	protected TestOne(){}
	protected void print(){
		System.out.println( i );
	}
	public static void main( String[] args ){
		System.out.println( "wocao" );
	}
}
class Quiz{
	public static void main( String[] args ){
		TestOne t = new TestOne();
		t.i = 1;
		t.print();
		TestOne.main( new String[]{ "a", "b", "c" } );
	}
}