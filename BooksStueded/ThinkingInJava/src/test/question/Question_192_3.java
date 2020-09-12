class Outer{
	private String str;
	Outer( String str ){
		this.str = str;
	}
	class Inner{
		public String toString(){
			return str;
		}
	}
	Inner getInner(){
		return new Inner();
	}
}
public class Question_192_3{
	public static void main( String[] args ){
		Outer outer = new Outer( "a" );
		Outer.Inner outerInner = outer.getInner();
		System.out.println( outerInner.toString() );
	}
}