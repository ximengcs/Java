abstract class TestFather{
	
}
class Son extends TestFather{
	void print(){
		System.out.println( "i am son" );
	}
}
public class Question_172_4{
	public static void use( TestFather t ){
		( (Son)t ).print();
	}
	public static void main( String[] args ){
		//Son s = new Son();
		//use(s);
		TestFather a = new TestFather();
	}
}