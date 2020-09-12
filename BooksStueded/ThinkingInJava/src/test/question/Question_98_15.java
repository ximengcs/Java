class Test{
	String s;
	{
		s = "a";
	}
	Test(){
		System.out.print( s );
	}
}
public class Question_98_15{
	public static void main( String[] args ){
		new Test();
	}
}