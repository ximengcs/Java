class Outer{
	class Inner{
		private String inner = "inner";
		Inner( String inner ){
			this.inner = inner;
		}
		String getString(){
			return inner;
		}
	}
	Inner getInner( String inner ){
		return new Inner( inner );
	}
}
public class Question_191_1{
	public static void main( String[] args ){
		Outer outer = new Outer();
		Outer.Inner outerInner = outer.getInner( "inner" );
		System.out.println( outerInner.getString() );
	}
}