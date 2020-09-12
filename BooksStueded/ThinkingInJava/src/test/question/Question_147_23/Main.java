class TestOne{
	static int i1 = 0;
	TestOne(){
		System.out.println( "TestOne" );
	}
}
class TestTwo extends TestOne{
	static int i2 = 1;
	TestTwo(){
		System.out.println( "TestTwo" );
	}
}
class TestThree extends TestTwo{
	static int i3 = 2;
	TestThree(){
		System.out.println( "TestThree" );
	}
	void print(){
		System.out.println( "load" );
	}
}
public class Main{
	public static void main( String[] args ){
	}
}
		