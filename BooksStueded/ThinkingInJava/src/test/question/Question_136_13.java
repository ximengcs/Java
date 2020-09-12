class TestFather{
	TestFather(){}
	void print(){
		System.out.println( "nothing" );
	}
	void print( int i ){
		System.out.println( i );
	}
	void print( double d ){
		System.out.println( d );
	}
}
class TestSon extends TestFather{
	TestSon(){}
	void print( String str ){
		System.out.println( str );
	}
}
public class Question_136_13{
	public static void main( String[] args ){
		TestSon t = new TestSon();
		t.print();
		t.print(1);
		t.print(1.0);
		t.print("1");
	}
}