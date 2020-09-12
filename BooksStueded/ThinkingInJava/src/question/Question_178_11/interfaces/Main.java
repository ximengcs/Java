import interfaces.classprocessor.*;
import interfaces.changestring.*;
class Main{
	public static void main( String[] args ){
		String s1 = "s1";
		String s2 = "s2";
		//StringAdapter s = new StringAdapter( s1 );
		Apply.process( new StringAdapter( new ChangeString() ), s1 ); 
		Apply.process( new StringAdapter( new ChangeString() ), s2 );
	}
}	