class WithFinals{
	private final void f(){
		System.out.println( "WithFinals.f()" );
	}
	private void g(){
		System.out.println( "WithFinals.g()" );
	}
}
class OverridePrivate extends WithFinals{
	@Override private final void q(){
		System.out.println( "OverridePrivate.f()" );
	}
	@Override private void b(){
		System.out.println( "OverridePrivate.g()" );
	}
}
public class Question_144_20{
	public static void main( String[] args ){
		OverridePrivate o = new OverridePrivate();
	}
}