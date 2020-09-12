class Test{
	static String s1 = "a";
	static String s2;
	static {
		s2 = "b";
	}
	Test(){
		System.out.print( s1 );
		System.out.print( s2 );
	}
}
public class Question_97_14{
	public static void main( String[] args ){
		new Test();
	}
}