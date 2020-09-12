class Tank{
	String state = "full";
	Tank(){};
	void check(){
		state = "null";
	}
	protected void finalize(){
		if( state.equals( "null" ) )
			System.out.print( "null" );
	}
}
public class Question_89_12{
	public static void main( String[] args ){
		Tank t1 = new Tank();
		new Tank().check();
		System.gc();
	}
}