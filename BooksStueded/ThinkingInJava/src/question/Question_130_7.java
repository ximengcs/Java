class A{
	A( int i ){ 
		System.out.println( "A" ); 
	}
}
class B{
	B( int i ){ 
		System.out.println( "B" ); 
	}
}
class C extends A{
	B b = new B(1);
	C(){
		super(1);
		System.out.println( "C" );
	}
}
public class Question_130_7{
	public static void main( String[] args ){
		C c = new C();
	}
}