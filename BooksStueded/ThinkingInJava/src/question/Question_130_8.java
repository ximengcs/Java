class FatherClass{
	FatherClass( int i ){
		System.out.println( "FatherClass" );
	}
}
class SonClass extends FatherClass{
	SonClass(){
		super(1);
		System.out.println( "SonClass-default" );
	}
	SonClass( int i ){
		super(i);
		System.out.println( "SonClass" );
	}
}
public class Question_130_8{
	public static void main( String[] args ){
		SonClass s1 = new SonClass();
		SonClass s2 = new SonClass(1);
	}
}